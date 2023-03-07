package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class StopsData {
    private Date lastUpdate;
    private Stop[] stops;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public String toString() {
        return "StopsData{" +
                "\n\tlastUpdate=" + lastUpdate +
                ", stops=" + Arrays.toString(stops) +
                '}';
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) throws ParseException {
        if (lastUpdate == null) {
            this.lastUpdate = null;
        }
        else {
            Date parsedDate = dateFormat.parse(lastUpdate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(parsedDate);
            calendar.add(Calendar.HOUR_OF_DAY, 1);
            this.lastUpdate = calendar.getTime();
        }
    }

    public Stop[] getStops() {
        return stops;
    }

    public void setStops(Stop[] stops) {
        this.stops = stops;
    }
}
