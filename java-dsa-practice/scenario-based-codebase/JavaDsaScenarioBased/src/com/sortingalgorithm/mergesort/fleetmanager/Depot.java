package com.sortingalgorithm.mergesort.fleetmanager;

import java.util.*;
class Depot {
    List<Vehicle> vehicles;

    Depot() {
        vehicles = new ArrayList<>();
    }

    void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    List<Vehicle> getVehicles() {
        return vehicles;
    }
}

