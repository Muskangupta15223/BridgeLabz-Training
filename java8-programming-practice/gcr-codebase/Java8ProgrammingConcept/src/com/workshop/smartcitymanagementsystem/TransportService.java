package com.workshop.smartcitymanagementsystem;
import java.util.Date;

interface TransportService {
    String getName();
    double getFare();
    Date getDepartureTime();

    // Default method
    default void printServiceDetails() {
        System.out.println("Service: " + getName() + ", Fare: " + getFare() + ", Departure: " + getDepartureTime());
    }
}
