package com.ParkEase;

import java.util.ArrayList;
import java.util.List;

public class ParkingManager {
    private List<ParkingSlot> slots = new ArrayList<>();

    // Add parking slot
    public void addSlot(ParkingSlot slot) {
        slots.add(slot);
    }

    // Assign first available slot
    public ParkingSlot assignSlot(Vehicle vehicle) {
        for (ParkingSlot slot : slots) {
            if (slot.isAvailable()) {
                slot.park(vehicle);
                return slot;
            }
        }
        return null;
    }

    // Release slot and calculate charges
    public double releaseSlot(ParkingSlot slot, double hours) {
        Vehicle vehicle = slot.unpark();
        return vehicle.calculateCharges(hours);
    }

    // Display availability
    public void showStatus() {
        for (ParkingSlot slot : slots) {
            System.out.println(
                "Slot " + slot.getSlotId() +
                " Available: " + slot.isAvailable()
            );
        }
    }
}

