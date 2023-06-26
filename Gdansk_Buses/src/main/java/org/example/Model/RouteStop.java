package org.example.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RouteStop {
    public int routeId;
    public int tripId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+1")
    public Date arrivalTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "GMT+1")
    public Date departureTime;
    public int stopId;
    public int stopSequence;
    public int variantId;
    public String busServiceName;
    public int order;
    public Stop stop;

    public int getStopSequence() {
        return stopSequence;
    }

    @Override
    public String toString() {
        return "\n    " +
//                "RouteStop{" +
//                "routeId=" + routeId +
//                ", tripId=" + tripId +
//                ", arrivalTime=" + arrivalTime +
                "departureTime=" + departureTime +
//                ", stopId=" + stopId +
//                ", stopSequence=" + stopSequence +
//                ", variantId=" + variantId +
//                ", busServiceName='" + busServiceName + '\'' +
//                ", order=" + order +
//                ", stop=" +
                stop +
                '}';
    }
}
