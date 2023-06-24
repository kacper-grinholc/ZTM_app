package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class ZtmClient {

    private final String baseUrl = "https://ckan.multimediagdansk.pl";
    private final String baseUrl2 = "https://ckan2.multimediagdansk.pl";
    private final String vehicleUrl = "/gpsPositions?v=2";
    private final String stopUrl = "/dataset/c24aa637-3619-4dc2-a171-a23eec8f2172/resource/4c4025f0-01bf-41f7-a39f-d156d201b82b/download/stops.json";
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

//    public VehiclesData fetchVehicleData() throws IOException {
//        String url = baseUrl2 + vehicleUrl;
//        ObjectMapper mapper = new ObjectMapper();
//        System.out.println("aaa" + url);
////        return mapper.readValue(new URL(url), VehiclesData.class);
//        return mapper.readValue(new File("src/main/resources/vehicles.json"), VehiclesData.class);
//    }


    public RouteDirections fetchRouteDirections() throws IOException {
        String url = baseUrl + "/dataset/c24aa637-3619-4dc2-a171-a23eec8f2172/resource/b15bb11c-7e06-4685-964e-3db7775f912f/download/trips.json";
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<HashMap<String, Object>> typeRef = new TypeReference<HashMap<String, Object>>() {
        };
        HashMap<String, Object> hashMap = objectMapper.readValue(new URL(url), typeRef);
        Date currentDate = new Date();
        String formattedDate = dateFormat.format(currentDate);
        return objectMapper.convertValue(hashMap.get(formattedDate), RouteDirections.class);
    }

    public StopsData fetchStopsData() throws IOException, ParseException {
        String url = baseUrl + stopUrl;
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<HashMap<String, Object>> typeRef = new TypeReference<HashMap<String, Object>>() {
        };
        HashMap<String, Object> hashMap = objectMapper.readValue(new URL(url), typeRef);
        Date currentDate = new Date();
        String formattedDate = dateFormat.format(currentDate);
        return objectMapper.convertValue(hashMap.get(formattedDate), StopsData.class);
    }

    public RouteData fetchRouteData(int tripId) throws IOException {
        Date currentDate = new Date();
        String formattedDate = dateFormat.format(currentDate);
        String url = baseUrl2 + "/stopTimes?date=" + formattedDate + "&routeId=" + tripId;
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new URL(url), RouteData.class);
    }
}
