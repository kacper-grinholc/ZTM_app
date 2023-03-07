package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class VehiclesData {
    private Date lastUpdate;
    private Vehicle[] vehicles;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    @Override
    public String toString() {
        return "VehiclesData{" +
                "\n\tlastUpdate='" + lastUpdate + '\'' +
                ",\nvehicles=" + Arrays.toString(vehicles) +
                '}';
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) throws ParseException {
        if (lastUpdate == null) {
            this.lastUpdate = null;
        }
        else {
            Date parsedDate = dateFormat.parse(lastUpdate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(parsedDate);
            calendar.add(Calendar.HOUR_OF_DAY, 1);
            this.lastUpdate = calendar.getTime();
        }
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
}