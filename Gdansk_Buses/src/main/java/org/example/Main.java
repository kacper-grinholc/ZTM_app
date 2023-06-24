package org.example;

import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        ZtmManager ztmManager = new ZtmManager();
        ztmManager.init();
//        System.out.println(ztmManager.getVehiclesData().getVehicles().get(0));
    }
}