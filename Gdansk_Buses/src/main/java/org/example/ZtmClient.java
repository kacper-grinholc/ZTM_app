package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ZtmClient {
    private VehicleData vehicleData;
    private StopsData stopsData;

    @Override
    public String toString() {
        return "ZtmClient{" +
                "vehicleData=" + vehicleData +
                ", stopsData=" + stopsData +
                '}';
    }

    public VehicleData getVehicleData() {
        return vehicleData;
    }

    public void setVehicleData() throws IOException {
        String url = "https://ckan2.multimediagdansk.pl/gpsPositions?v=2";
        ObjectMapper mapper = new ObjectMapper();
        this.vehicleData = mapper.readValue(new URL(url), VehicleData.class);
    }

    public StopsData getStopsData() {
        return stopsData;
    }

    public void setStopsData() throws IOException {
        String url = "https://ckan.multimediagdansk.pl/dataset/c24aa637-3619-4dc2-a171-a23eec8f2172/resource/4c4025f0-01bf-41f7-a39f-d156d201b82b/download/stops.json";
        ObjectMapper mapper = new ObjectMapper();
        this.stopsData = mapper.readValue(new URL(url), StopsData.class);
    }
}
