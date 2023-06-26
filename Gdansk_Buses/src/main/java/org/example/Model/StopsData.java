package org.example.Model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class StopsData {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdate;
    private List<Stop> stops;

    @Override
    public String toString() {
        return "StopsData{" +
                "lastUpdate=" + lastUpdate +
                ", stops=" + stops +
                '}';
    }

    public List<Stop> getStops() {
        return stops;
    }

    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }
}
