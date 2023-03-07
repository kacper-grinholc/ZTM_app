package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
class Vehicle {
    public Date generated;
    public String routeShortName;
    public int tripId;
    public String headsign;
    public String vehicleCode;
    public String vehicleService;
    public int vehicleId;
    public int speed;
    public int direction;
    public int delay;
    public Date scheduledTripStartTime;
    public double lat;
    public double lon;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    @Override
    public String toString() {
        return "\nVehicle{" +
                "\n\tgenerated='" + generated + '\'' +
                ",\n\trouteShortName='" + routeShortName + '\'' +
                ",\n\ttripId=" + tripId +
                ",\n\theadsign='" + headsign + '\'' +
                ",\n\tvehicleCode='" + vehicleCode + '\'' +
                ",\n\tvehicleService='" + vehicleService + '\'' +
                ",\n\tvehicleId=" + vehicleId +
                ",\n\tspeed=" + speed +
                ",\n\tdirection=" + direction +
                ",\n\tdelay=" + delay +
                ",\n\tscheduledTripStartTime='" + scheduledTripStartTime + '\'' +
                ",\n\tlat=" + lat +
                ",\n\tlon=" + lon +
                "}";
    }

    public Date getGenerated() {
        return generated;
    }

    public void setGenerated(String generated) throws ParseException {
        if (generated == null) {
            this.generated = null;
        }
        else {
            Date parsedDate = dateFormat.parse(generated);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(parsedDate);
            calendar.add(Calendar.HOUR_OF_DAY, 1);
            this.generated = calendar.getTime();
        }
    }

    public void setScheduledTripStartTime(String scheduledTripStartTime) throws ParseException {
        if (scheduledTripStartTime == null) {
            this.scheduledTripStartTime = null;
        }
        else {
            Date parsedDate = dateFormat.parse(scheduledTripStartTime);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(parsedDate);
            calendar.add(Calendar.HOUR_OF_DAY, 1);
            this.scheduledTripStartTime = calendar.getTime();
        }
    }
}

