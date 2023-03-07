package org.example;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ZtmManager ztmManager = new ZtmManager();
        ztmManager.init();
        System.out.println(ztmManager.getVehicleData());
    }
}