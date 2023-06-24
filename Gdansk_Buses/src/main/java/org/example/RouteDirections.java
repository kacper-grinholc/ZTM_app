package org.example;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RouteDirections {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    public Date lastUpdate;
    public List<Route> trips;

    public RouteDirections() {
    }

    public RouteDirections(Date lastUpdate, List<Route> trips) {
        this.lastUpdate = lastUpdate;
        this.trips = trips;
    }

    public List<Route> getTrips() {
        return trips;
    }

    @Override
    public String toString() {
        return "RouteDirections{" +
                "lastUpdate=" + lastUpdate +
                ", trips=" + trips +
                '}';
    }
}
