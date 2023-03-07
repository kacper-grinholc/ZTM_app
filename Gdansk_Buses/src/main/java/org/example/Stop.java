package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Stop {
    private int stopId;
    private String stopCode;
    private String stopName;
    private String stopShortName;
    private String stopDesc;
    private String subName;
    private Date date;
    private int zoneId;
    private String zoneName;
    private int virtual;
    private int nonpassenger;
    private int depot;
    private int ticketZoneBorder;
    private int onDemand;
    private Date activationDate;
    private double stopLat;
    private double stopLon;
    private String stopUrl;
    private String locationType;
    private String parentStation;
    private String stopTimezone;
    private String wheelchairBoarding;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");


    @Override
    public String toString() {
        return "\nStop{" +
                "\n\tstopId=" + stopId +
                ",\n\tstopCode='" + stopCode + '\'' +
                ",\n\tstopName='" + stopName + '\'' +
                ",\n\tstopShortName='" + stopShortName + '\'' +
                ",\n\tstopDesc='" + stopDesc + '\'' +
                ",\n\tsubName='" + subName + '\'' +
                ",\n\tdate=" + date +
                ",\n\tzoneId=" + zoneId +
                ",\n\tzoneName='" + zoneName + '\'' +
                ",\n\tvirtual=" + virtual +
                ",\n\tnonpassenger=" + nonpassenger +
                ",\n\tdepot=" + depot +
                ",\n\tticketZoneBorder=" + ticketZoneBorder +
                ",\n\tonDemand=" + onDemand +
                ",\n\tactivationDate=" + activationDate +
                ",\n\tstopLat=" + stopLat +
                ",\n\tstopLon=" + stopLon +
                ",\n\tstopUrl='" + stopUrl + '\'' +
                ",\n\tlocationType='" + locationType + '\'' +
                ",\n\tparentStation='" + parentStation + '\'' +
                ",\n\tstopTimezone='" + stopTimezone + '\'' +
                ",\n\twheelchairBoarding='" + wheelchairBoarding + '\'' +
                '}';
    }

    public int getStopId() {
        return stopId;
    }

    public void setStopId(int stopId) {
        this.stopId = stopId;
    }

    public String getStopCode() {
        return stopCode;
    }

    public void setStopCode(String stopCode) {
        this.stopCode = stopCode;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public String getStopShortName() {
        return stopShortName;
    }

    public void setStopShortName(String stopShortName) {
        this.stopShortName = stopShortName;
    }

    public String getStopDesc() {
        return stopDesc;
    }

    public void setStopDesc(String stopDesc) {
        this.stopDesc = stopDesc;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(String date) throws ParseException {
        if (date == null) {
            this.date = null;
        }
        else {
            this.date = dateFormat.parse(date);
        }
    }

    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public int getVirtual() {
        return virtual;
    }

    public void setVirtual(int virtual) {
        this.virtual = virtual;
    }

    public int getNonpassenger() {
        return nonpassenger;
    }

    public void setNonpassenger(int nonpassenger) {
        this.nonpassenger = nonpassenger;
    }

    public int getDepot() {
        return depot;
    }

    public void setDepot(int depot) {
        this.depot = depot;
    }

    public int getTicketZoneBorder() {
        return ticketZoneBorder;
    }

    public void setTicketZoneBorder(int ticketZoneBorder) {
        this.ticketZoneBorder = ticketZoneBorder;
    }

    public int getOnDemand() {
        return onDemand;
    }

    public void setOnDemand(int onDemand) {
        this.onDemand = onDemand;
    }

    public Date getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) throws ParseException {
        if (activationDate == null) {
            this.activationDate = null;
        }
        else {
            this.activationDate = dateFormat.parse(activationDate);
        }
    }

    public double getStopLat() {
        return stopLat;
    }

    public void setStopLat(double stopLat) {
        this.stopLat = stopLat;
    }

    public double getStopLon() {
        return stopLon;
    }

    public void setStopLon(double stopLon) {
        this.stopLon = stopLon;
    }

    public String getStopUrl() {
        return stopUrl;
    }

    public void setStopUrl(String stopUrl) {
        this.stopUrl = stopUrl;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getParentStation() {
        return parentStation;
    }

    public void setParentStation(String parentStation) {
        this.parentStation = parentStation;
    }

    public String getStopTimezone() {
        return stopTimezone;
    }

    public void setStopTimezone(String stopTimezone) {
        this.stopTimezone = stopTimezone;
    }

    public String getWheelchairBoarding() {
        return wheelchairBoarding;
    }

    public void setWheelchairBoarding(String wheelchairBoarding) {
        this.wheelchairBoarding = wheelchairBoarding;
    }
}
