package org.example;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ZtmClient ztmClient = new ZtmClient();
        ztmClient.setVehicleData();
        ztmClient.setStopsData();
        System.out.println(ztmClient);
    }
}