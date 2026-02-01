package com.functionalinterface.unitconversion;


public class LogisticsApp {

    public static void main(String[] args) {

        // km to miles
        double miles = UnitConverter.convert(
                10,
                km -> km * 0.621371
        );

        // kg to lbs
        double lbs = UnitConverter.convert(
                5,
                kg -> kg * 2.20462
        );

        System.out.println("10 km = " + miles + " miles");
        System.out.println("5 kg = " + lbs + " lbs");
    }
}
