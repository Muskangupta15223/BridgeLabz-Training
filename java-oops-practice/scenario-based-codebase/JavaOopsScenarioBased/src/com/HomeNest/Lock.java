package com.HomeNest;

public class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId, 0.01);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Door locked");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Door unlocked");
    }

    public void reset() {
        System.out.println("Lock security recalibrated");
    }
}

