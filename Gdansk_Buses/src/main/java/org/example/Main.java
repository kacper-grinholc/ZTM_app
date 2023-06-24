package org.example;

import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        ZtmManager ztmManager = new ZtmManager();
        ztmManager.init();
        ztmManager.getRoutes(107);
        ztmManager.getRouteStops(201, 107);
    }
}