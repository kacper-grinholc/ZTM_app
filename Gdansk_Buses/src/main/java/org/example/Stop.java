package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stop {
    public int stopId;
    public String stopName;
    public String stopDesc;
    public String subName;
    public int zoneId;
    public String zoneName;
    public boolean onDemand;
    public double stopLat;
    public double stopLon;

    @Override
    public String toString() {
        return "\n      Stop{" +
                "stopId=" + stopId +
                ", stopName='" + stopName + '\'' +
                ", stopDesc='" + stopDesc + '\'' +
                ", subName='" + subName + '\'' +
                ", zoneId=" + zoneId +
                ", zoneName='" + zoneName + '\'' +
                ", onDemand=" + onDemand +
                ", stopLat=" + stopLat +
                ", stopLon=" + stopLon +
                '}';
    }
}
