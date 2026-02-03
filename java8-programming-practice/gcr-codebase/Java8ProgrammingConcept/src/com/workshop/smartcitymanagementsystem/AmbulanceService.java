package com.workshop.smartcitymanagementsystem;

import java.util.Date;

class AmbulanceService implements TransportService, EmergencyService {
    private String name;
    private double fare;
    private Date departureTime;

    AmbulanceService(String name, double fare, Date departureTime) {
        this.name = name;
        this.fare = fare;
        this.departureTime = departureTime;
    }

    public String getName() { return name; }
    public double getFare() { return fare; }
    public Date getDepartureTime() { return departureTime; }
    
    @Override
    public String toString() {
        return "Service: " + name + ", Fare: " + fare + ", Departure: " + departureTime;
    }

}

