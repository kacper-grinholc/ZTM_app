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
        return "\nStop{" +
                "\n\tstopId=" + stopId +
                ",\n\tstopName='" + stopName + '\'' +
                ",\n\tstopDesc='" + stopDesc + '\'' +
                ",\n\tsubName='" + subName + '\'' +
                ",\n\tzoneId=" + zoneId +
                ",\n\tzoneName='" + zoneName + '\'' +
                ",\n\tonDemand=" + onDemand +
                ",\n\tstopLat=" + stopLat +
                ",\n\tstopLon=" + stopLon +
                '}';
    }
}
