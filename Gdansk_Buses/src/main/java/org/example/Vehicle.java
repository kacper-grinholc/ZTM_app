package org.example;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
class Vehicle {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    public Date scheduledTripStartTime;
    public double lat;
    public double lon;


    @Override
    public String toString() {
        return "\nVehicle{" +
                "\n\tgenerated='" + generated + '\'' +
                ",\n\trouteShortName='" + routeShortName + '\'' +
                ",\n\ttripId=" + tripId +
                ",\n\theadsign='" + headsign + '\'' +
//                ",\n\tvehicleCode='" + vehicleCode + '\'' +
                ",\n\tvehicleService='" + vehicleService + '\'' +
//                ",\n\tvehicleId=" + vehicleId +
//                ",\n\tspeed=" + speed +
//                ",\n\tdirection=" + direction +
                ",\n\tdelay=" + delay +
                ",\n\tscheduledTripStartTime='" + scheduledTripStartTime + '\'' +
//                ",\n\tlat=" + lat +
//                ",\n\tlon=" + lon +
                "}";
    }
}

