package org.example;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class ZtmManager {
    ZtmClient ztmClient = new ZtmClient();
    private RouteDirections routeDirections;
    private StopsData stopsData;

    public void init() throws IOException, ParseException {
        this.routeDirections = ztmClient.fetchRouteDirections();
        this.stopsData = ztmClient.fetchStopsData();
    }

    public List<Route> getRoutes(int routeId){
        List<Route> result = new ArrayList<>();
        for (Route route:this.routeDirections.getTrips()) {
            if (Objects.equals(route.routeId, routeId) && Objects.equals(route.type, "MAIN")){
                result.add(route);
            }
        }
        System.out.println(result);
        return result;
    }

    public List<FullTrip> getRouteStops(int tripId, int routeId) throws IOException {
        List<FullTrip> busSchedule = new ArrayList<>();
        RouteData routeData = ztmClient.fetchRouteData(routeId);
        int lastStopNumber = routeData.stopTimes.stream().mapToInt(RouteStop::getStopSequence).max().orElse(0);
        FullTrip fullTrip = new FullTrip();
        fullTrip.trips = new ArrayList<>();
        for (RouteStop routeStop: routeData.stopTimes) {
            if (routeStop.tripId == tripId){
                routeStop.stop = replaceStop(routeStop.stopId);
                fullTrip.trips.add(routeStop);
                if (routeStop.stopSequence == lastStopNumber) {
                    fullTrip.startTime = fullTrip.trips.get(0).arrivalTime;
                    fullTrip.endTime = routeStop.arrivalTime;
                    busSchedule.add(fullTrip);
                    fullTrip = new FullTrip();
                    fullTrip.trips = new ArrayList<>();
                }
            }
        }
        System.out.println(busSchedule);
        return busSchedule;
    }

    private Stop replaceStop(int stopId) {
        return stopsData.getStops().stream()
                .filter(stop -> stop.stopId == stopId)
                .findFirst()
                .orElse(null);
    }
    @Override
    public String toString() {
        return "ZtmManager{" +
                "routeDirections=" + routeDirections +
                ", stopsData=" + stopsData +
                '}';
    }
}
