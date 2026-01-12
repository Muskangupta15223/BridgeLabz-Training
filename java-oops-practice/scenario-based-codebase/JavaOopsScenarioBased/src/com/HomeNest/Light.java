package com.HomeNest;

public class Light extends Device {

    public Light(String deviceId) {
        super(deviceId, 0.05);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Light ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Light OFF");
    }

    public void reset() {
        System.out.println("Light brightness reset");
    }
}

