package com.HomeNest;

public class Main {

    public static void main(String[] args) {

        Device[] devices = {
            new Light("L101"),
            new Camera("C202"),
            new Thermostat("T303"),
            new Lock("D404")
        };

        for (Device d : devices) {
            d.turnOn();
            d.reset(); 
            System.out.println("Energy for 5 hrs: " + d.calculateEnergy(5));
            System.out.println("-------------");
        }
    }
}
