package com.HomeNest;

public abstract class Device implements IControllable {

    protected String deviceId;
    private boolean status;           // encapsulated
    protected double energyUsage;

    protected Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        logFirmwareUpdate();
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public double calculateEnergy(int hours) {
        return energyUsage * hours;   // operator usage
    }

    protected void logFirmwareUpdate() {
        System.out.println("Firmware log secured for device: " + deviceId);
    }

    public abstract void reset();  // polymorphism
}
