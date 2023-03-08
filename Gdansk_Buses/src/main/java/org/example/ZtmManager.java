package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ZtmManager {
    private VehiclesData vehiclesData;
    private StopsData stopsData;

    public void init() throws IOException {
        ZtmClient ztmClient = new ZtmClient();
        this.vehiclesData = ztmClient.fetchVehicleData();
        this.stopsData = ztmClient.fetchStopsData();
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = formatter.format(currentDate);
        for (Vehicle vehicle : vehiclesData.getVehicles()) {
            String url = "https://ckan2.multimediagdansk.pl/stopTimes?date=" + formattedDate + "&routeId=" + vehicle.vehicleService.substring(0, 3).replaceAll("^0+(?!$)", "");
            ObjectMapper mapper = new ObjectMapper();
            RouteData routeData = mapper.readValue(new URL(url), RouteData.class);
            int first_stop_id = 0;
            int first_stop_order = 0;
            String first_stop_busServiceName = "";
            for (RouteStop el : routeData.stopTimes) {
                if (el.tripId == vehicle.tripId && Objects.equals(el.busServiceName, vehicle.vehicleService)) {
                    SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
                    String formattedTime1 = formatter2.format(el.departureTime);
                    String formattedTime2 = formatter2.format(vehicle.scheduledTripStartTime);
                    if (Objects.equals(formattedTime1, formattedTime2)) {
                        first_stop_id = el.variantId;
                        first_stop_order = el.order;
                        first_stop_busServiceName = el.busServiceName;
                    }
                }
            }
            List<RouteStop> routeStops = new ArrayList<RouteStop>();
            System.out.println(first_stop_id + " " + vehicle.routeShortName);
            for (RouteStop el : routeData.stopTimes) {
                if (el.variantId == first_stop_id && el.order == first_stop_order && Objects.equals(el.busServiceName, first_stop_busServiceName)) {
                    routeStops.add(el);
                }
            }
            RouteData result = new RouteData();
            result.lastUpdate = routeData.lastUpdate;
            result.stopTimes = routeStops;
            vehicle.routeData = result;
        }
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
