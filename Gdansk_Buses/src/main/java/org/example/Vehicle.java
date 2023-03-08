package org.example;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
class Vehicle {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    public Date generated;
    public String routeShortName;
    public Integer tripId;
    public String headsign;
    public String vehicleCode;
    public String vehicleService;
    public int vehicleId;
    public int speed;
    public int direction;
    public int delay;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT+1")
    public Date scheduledTripStartTime;
    public double lat;
    public double lon;
    public RouteData routeData;

    public void setRouteData(RouteData routeData) {
        this.routeData = routeData;
    }

    @Override
    public String toString() {
        return "\nVehices{" + "\n\tgenerated='" + generated + '\'' + ",\n\trouteShortName='" + routeShortName + '\'' + ",\n\ttripId=" + tripId + ",\n\theadsign='" + headsign + '\'' +
                ",\n\tvehicleCode='" + vehicleCode + '\'' +
                ",\n\tvehicleService='" + vehicleService + '\'' +
//                ",\n\tvehicleId=" + vehicleId +
//                ",\n\tspeed=" + speed +
//                ",\n\tdirection=" + direction +
                ",\n\tdelay=" + delay + ",\n\tscheduledTripStartTime='" + scheduledTripStartTime + '\'' +
//                ",\n\tlat=" + lat +
//                ",\n\tlon=" + lon +
                ",\n\trouteData=" + routeData + "}";
    }
}

