package com.trafficmanager;

class Vehicle {
    int vehicleId;
    Vehicle next;

    Vehicle(int vehicleId) {
        this.vehicleId = vehicleId;
        this.next = null;
    }
}