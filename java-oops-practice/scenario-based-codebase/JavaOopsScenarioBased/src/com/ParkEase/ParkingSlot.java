package com.ParkEase;
public class ParkingSlot {
    private String slotId;
    private boolean occupied;
    private Vehicle vehicle;

    // Constructor
    public ParkingSlot(String slotId) {
        this.slotId = slotId;
        this.occupied = false;
    }

    // Park vehicle
    public void park(Vehicle vehicle) {
        if (!occupied) {
            this.vehicle = vehicle;
            this.occupied = true;
        }
    }

    // Remove vehicle
    public Vehicle unpark() {
        Vehicle temp = vehicle;
        vehicle = null;
        occupied = false;
        return temp;
    }

    // Check availability
    public boolean isAvailable() {
        return !occupied;
    }

    public String getSlotId() {
        return slotId;
    }
}