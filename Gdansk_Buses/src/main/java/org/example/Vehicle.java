package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Vehicle {
    private Date generated;
    private String routeShortName;
    private int tripId;
    private String headsign;
    private String vehicleCode;
    private String vehicleService;
    private int vehicleId;
    private int speed;
    private int direction;
    private int delay;
    private Date scheduledTripStartTime;
    private double lat;
    private double lon;
    private int gpsQuality;

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
                ",\n\tgpsQuality=" + gpsQuality +
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

    public String getRouteShortName() {
        return routeShortName;
    }

    public void setRouteShortName(String routeShortName) {
        this.routeShortName = routeShortName;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getHeadsign() {
        return headsign;
    }

    public void setHeadsign(String headsign) {
        this.headsign = headsign;
    }

    public String getVehicleCode() {
        return vehicleCode;
    }

    public void setVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode;
    }

    public String getVehicleService() {
        return vehicleService;
    }

    public void setVehicleService(String vehicleService) {
        this.vehicleService = vehicleService;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public Date getScheduledTripStartTime() {
        return scheduledTripStartTime;
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

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getGpsQuality() {
        return gpsQuality;
    }

    public void setGpsQuality(int gpsQuality) {
        this.gpsQuality = gpsQuality;
    }
}

