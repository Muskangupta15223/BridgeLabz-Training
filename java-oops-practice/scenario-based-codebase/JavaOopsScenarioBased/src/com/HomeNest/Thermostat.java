package com.HomeNest;

public class Thermostat extends Device {

    public Thermostat(String deviceId) {
        super(deviceId, 0.2);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat activated");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat off");
    }

    public void reset() {
        System.out.println("Temperature set to default");
    }
}

