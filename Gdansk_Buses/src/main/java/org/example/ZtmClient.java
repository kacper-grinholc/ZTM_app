package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class ZtmClient {

    private final String baseUrl = "https://ckan.multimediagdansk.pl";
    private final String baseUrl2 = "https://ckan2.multimediagdansk.pl";
    private final String vehicleUrl = "/gpsPositions?v=2";
    private final String stopUrl = "/dataset/c24aa637-3619-4dc2-a171-a23eec8f2172/resource/4c4025f0-01bf-41f7-a39f-d156d201b82b/download/stops.json";
    public VehiclesData fetchVehicleData() throws IOException {
        String url = baseUrl2 + vehicleUrl;
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new URL(url), VehiclesData.class);
    }

    public StopsData fetchStopsData() throws IOException {
        String url = baseUrl + stopUrl;

        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<HashMap<String,Object>> typeRef = new TypeReference<HashMap<String,Object>>() {};
        HashMap<String, Object> hashMap = objectMapper.readValue(new URL(url), typeRef);

        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = formatter.format(currentDate);

        return objectMapper.convertValue(hashMap.get(formattedDate), StopsData.class);
    }
}
