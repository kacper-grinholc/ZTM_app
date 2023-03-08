package org.example;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class VehiclesData {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    public Date lastUpdate;
    private List<Vehicle> vehicles;

    @Override
    public String toString() {
        return "VehiclesData{" +
                "lastUpdate=" + lastUpdate +
                ", vehicles=" + vehicles +
                '}';
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehices) {
        this.vehicles = vehices;
    }
}
