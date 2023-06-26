package org.example.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Route {
    public int routeId;
    public int tripId;
    public String tripHeadsign;
    public String type;

    public Route() {
    }

    public Route(int routeId, int tripId, String tripHeadsign, String type) {
        this.routeId = routeId;
        this.tripId = tripId;
        this.tripHeadsign = tripHeadsign;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Route{" +
                "routeId=" + routeId +
                ", tripId=" + tripId +
                ", tripHeadsign='" + tripHeadsign + '\'' +
//                ", type='" + type + '\'' +
                '}';
    }
}
