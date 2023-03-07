package org.example;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Arrays;
import java.util.Date;

public class VehiclesData {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    public Date lastUpdate;
    private Vehicle[] vehicles;

    @Override
    public String toString() {
        return "VehiclesData{" +
                "\n\tlastUpdate='" + lastUpdate + '\'' +
                ",\nvehicles=" + Arrays.toString(vehicles) +
                '}';
    }
    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
}
