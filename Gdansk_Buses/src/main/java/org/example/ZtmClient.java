package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ZtmClient {

    private final String baseUrl = "https://ckan.multimediagdansk.pl";
    private final String baseUrl2 = "https://ckan2.multimediagdansk.pl";
    private final String vehicleUrl = "/gpsPositions?v=2";
    private final String stopUrl = "/dataset/c24aa637-3619-4dc2-a171-a23eec8f2172/resource/4c4025f0-01bf-41f7-a39f-d156d201b82b/download/stops.json";

//    public VehiclesData fetchVehicleData() throws IOException {
//        String url = baseUrl2 + vehicleUrl;
//        ObjectMapper mapper = new ObjectMapper();
//        System.out.println("aaa" + url);
////        return mapper.readValue(new URL(url), VehiclesData.class);
//        return mapper.readValue(new File("src/main/resources/vehicles.json"), VehiclesData.class);
//    }
//
//    public StopsData fetchStopsData() throws IOException, ParseException {
//        String url = baseUrl + stopUrl;
//        System.out.println("bbb" + url);
//        ObjectMapper objectMapper = new ObjectMapper();
//        TypeReference<HashMap<String, Object>> typeRef = new TypeReference<HashMap<String, Object>>() {
//        };
////        HashMap<String, Object> hashMap = objectMapper.readValue(new URL(url), typeRef);
//        HashMap<String, Object> hashMap = objectMapper.readValue(new File("src/main/resources/stops.json"), typeRef);
//        Map<String, Object> Maphash = objectMapper.readValue(new File("src/main/resources/stops.json"), typeRef);
//        Date currentDate = new Date();
//        String dateString = "2023-03-08";
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = formatter.parse(dateString);
//        String formattedDate = formatter.format(date);
//        return objectMapper.convertValue(Maphash.get(formattedDate), StopsData.class);
//    }
//
//    public RouteData fetchRouteData(String date,Vehicle vehicle) throws IOException{
//        String url = "https://ckan2.multimediagdansk.pl/stopTimes?date=" + date + "&routeId=" + vehicle.vehicleService.substring(0, 3).replaceAll("^0+(?!$)", "");
//        System.out.println("ccc" + url);
//        ObjectMapper mapper = new ObjectMapper();
//        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
//
////        return mapper.readValue(new URL(url), RouteData.class);
//        return mapper.readValue(new File("src/main/resources/2023-03-08" + vehicle.vehicleService.substring(0, 3).replaceAll("^0+(?!$)", "") + ".json"), RouteData.class);
//    }
}
