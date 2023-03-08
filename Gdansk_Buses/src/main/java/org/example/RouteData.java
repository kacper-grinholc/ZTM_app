package org.example;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RouteData {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    public Date lastUpdate;
    public List<RouteStop> stopTimes;

    @Override
    public String toString() {
        return "RouteData{" + "lastUpdate=" + lastUpdate + ", stopTimes=" + stopTimes + '}';
    }
}
