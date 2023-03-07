package org.example;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Arrays;
import java.util.Date;

public class StopsData {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastUpdate;
    private Stop[] stops;

    @Override
    public String toString() {
        return "StopsData{" +
                "\n\tlastUpdate=" + lastUpdate +
                ", stops=" + Arrays.toString(stops) +
                '}';
    }

    public Stop[] getStops() {
        return stops;
    }

    public void setStops(Stop[] stops) {
        this.stops = stops;
    }
}
