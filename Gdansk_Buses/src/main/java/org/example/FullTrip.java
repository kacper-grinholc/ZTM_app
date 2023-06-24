package org.example;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FullTrip {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    public Date startTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    public Date endTime;
    public List<RouteStop> trips;

    public Vehicle vehicle;

    public FullTrip() {
    }

    public FullTrip(Date startTime, Date endTime, List<RouteStop> trips, Vehicle vehicle) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.trips = trips;
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "\n FullTrip{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", trips=" + trips +
                ", vehicle=" + vehicle +
                '}';
    }
}
