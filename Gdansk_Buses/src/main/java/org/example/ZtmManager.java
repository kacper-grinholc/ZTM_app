package org.example;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class ZtmManager {
    ZtmClient ztmClient = new ZtmClient();
    private VehiclesData vehiclesData;
    private StopsData stopsData;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

    public void init() throws IOException {
        this.stopsData = ztmClient.fetchStopsData();
        setVehiclesRoute();
        addStopsToRoute();
    }

    private void setVehiclesRoute() throws IOException {
        VehiclesData vehiclesData = ztmClient.fetchVehicleData();
        vehiclesData.getVehicles().removeIf( vehicle -> vehicle.tripId == null && vehicle.scheduledTripStartTime == null);
        List<Vehicle> vehicles = new ArrayList<>();
        Date currentDate = new Date();
        String formattedDate = dateFormat.format(currentDate);
        for (Vehicle vehicle : vehiclesData.getVehicles()) {
            RouteData downloadedRoutes = ztmClient.fetchRouteData(formattedDate, vehicle);
            final Optional<RouteStop> firstStop = findFirstStop(vehicle, downloadedRoutes);
            if (firstStop.isEmpty()){
                continue;
            }
            System.out.println(firstStop.get().stopId + " " + vehicle.routeShortName);

            final List<RouteStop> routeStops = findAllStops(downloadedRoutes, firstStop.get());

            vehicle.routeData = new RouteData(downloadedRoutes.lastUpdate, routeStops);
            vehicles.add(vehicle);
        }
        vehiclesData.setVehicles(vehicles);
        this.vehiclesData = vehiclesData;
    }

    private static List<RouteStop> findAllStops(RouteData downloadedRoutes, RouteStop firstStop) {
        return downloadedRoutes.stopTimes.stream()
                .filter(el -> isStopOnRoute(firstStop, el))
                .toList();
    }

    public void addStopsToRoute(){
        List<Stop> stops = stopsData.getStops();
        Map<Integer, Stop> stopIdMap = stops.stream().collect(Collectors.toMap(i -> i.stopId, i -> i));
        this.vehiclesData.getVehicles().forEach( v -> {
            v.routeData.stopTimes.forEach(s -> {
                s.stop = stopIdMap.get(s.stopId);
            });
        });
    }

    private Optional<RouteStop> findFirstStop(Vehicle vehicle, RouteData downloadedRoutes) {
        return downloadedRoutes.stopTimes.stream()
                .filter(stop -> isFirstStopOnRoute(vehicle, stop))
                .findFirst();
    }


    private boolean isFirstStopOnRoute(Vehicle vehicle, RouteStop stop) {
        String formattedTime1 = timeFormat.format(stop.departureTime);
        String formattedTime2 = timeFormat.format(vehicle.scheduledTripStartTime);
        return stop.tripId == vehicle.tripId && stop.busServiceName.equals(vehicle.vehicleService) && formattedTime1.equals(formattedTime2);
    }

    private static boolean isStopOnRoute(RouteStop firstStop, RouteStop el) {
        return el.variantId == firstStop.variantId && el.order == firstStop.order && Objects.equals(el.busServiceName, firstStop.busServiceName);
    }

    @Override
    public String toString() {
        return "ZtmService{" + "\n\tvehicesData=" + vehiclesData + ",\n\tstopsData=" + stopsData + '}';
    }

    public VehiclesData getVehiclesData() {
        return vehiclesData;
    }

    public StopsData getStopsData() {
        return stopsData;
    }
}
