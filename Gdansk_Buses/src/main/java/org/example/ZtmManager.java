package org.example;

import java.io.IOException;

public class ZtmManager {
    private VehiclesData vehicleData;
    private StopsData stopsData;

    public void init() throws IOException {
        ZtmClient ztmClient = new ZtmClient();
        this.vehicleData = ztmClient.fetchVehicleData();
        this.stopsData = ztmClient.fetchStopsData();
    }

    @Override
    public String toString() {
        return "ZtmService{" +
                "\n\tvehicleData=" + vehicleData +
                ",\n\tstopsData=" + stopsData +
                '}';
    }

    public VehiclesData getVehicleData() {
        return vehicleData;
    }

    public StopsData getStopsData() {
        return stopsData;
    }
}
