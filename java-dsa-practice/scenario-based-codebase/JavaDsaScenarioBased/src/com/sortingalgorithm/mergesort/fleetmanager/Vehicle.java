package com.sortingalgorithm.mergesort.fleetmanager;

class Vehicle {
    int vehicleId;
    int mileage;

    Vehicle(int vehicleId, int mileage) {
        this.vehicleId = vehicleId;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "VehicleID: " + vehicleId + ", Mileage: " + mileage;
    }
}

