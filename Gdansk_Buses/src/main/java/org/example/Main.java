package org.example;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        ZtmManager ztmManager = new ZtmManager();
        ztmManager.init();
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.print("Enter a bus number:");
            int routeid = scanner.nextInt();
            ztmManager.getRoutes(routeid);
            System.out.print("Enter a bus trip:");
            int tripid = scanner.nextInt();
            ztmManager.getRouteStops(tripid, routeid);
            System.out.print("Do you want to look for new one? (Y/N): ");
            String continueOption = scanner.next();
            shouldContinue = continueOption.equalsIgnoreCase("Y");
        }

    }
}