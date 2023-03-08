package org.example;

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

    @Override
    public String toString() {
        return "\nRouteStop{" + "\n\trouteId=" + routeId + ",\n\ttripId=" + tripId + ",\n\tarrivalTime=" + arrivalTime + ",\n\tdepartureTime=" + departureTime + ",\n\tstopId=" + stopId + ",\n\tstopSequence=" + stopSequence + ",\n\tvariantId=" + variantId + ",\n\tbusServiceName='" + busServiceName + '\'' + ",\n\torder=" + order + ",\n\tstop=" + stop + '}';
    }
}
