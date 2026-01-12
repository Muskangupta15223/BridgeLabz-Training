package com.HomeNest;

public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId, 0.1);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Camera recording started");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera stopped");
    }

    public void reset() {
        System.out.println("Camera angle reset");
    }
}
