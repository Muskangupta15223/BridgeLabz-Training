package com.workshop.smartcitymanagementsystem;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;
import java.util.*;

public class SmartCityTransportSystem {
    public static void main(String[] args) {
        List<TransportService> services = Arrays.asList(
            new BusService("City Bus", 15.0, new Date(System.currentTimeMillis() + 10000)),
            new MetroService("Metro Line 1", 25.0, new Date(System.currentTimeMillis() + 20000)),
            new TaxiService("Taxi #101", 50.0, new Date(System.currentTimeMillis() + 5000)),
            new AmbulanceService("Ambulance", 0.0, new Date())
        );

        // 1. Lambda Expressions – Filter & Sort
        System.out.println("\n--- Filtered & Sorted Services (by fare) ---");
        services.stream()
                .filter(s -> s.getFare() > 10)
                .sorted(Comparator.comparing(TransportService::getFare))
                .forEach(TransportService::printServiceDetails);

        // 2. Method References – Quick Printing
        System.out.println("\n--- All Services ---");
        services.forEach(TransportService::printServiceDetails);

        // 3. Functional Interface – Fare Calculation
        FareCalculator fareCalc = (distance, rate) -> distance * rate;
        double fare = fareCalc.calculateFare(GeoUtils.calculateDistance("A", "B"), 10);
        System.out.println("\nFare calculated via lambda: " + fare);

        // 4. Stream API + Collectors – Revenue Reports
        System.out.println("\n--- Revenue Reports ---");
        DoubleSummaryStatistics stats = services.stream()
                .collect(Collectors.summarizingDouble(TransportService::getFare));
        System.out.println("Total Revenue: " + stats.getSum());
        System.out.println("Average Fare: " + stats.getAverage());

        // Grouping by Service Type
        Map<String, List<TransportService>> grouped = services.stream()
                .collect(Collectors.groupingBy(s -> s.getClass().getSimpleName()));
        System.out.println("\nGrouped by Service Type: " + grouped);

        // Partitioning by Peak vs Non-Peak (dummy condition: fare > 20)
        Map<Boolean, List<TransportService>> partitioned = services.stream()
                .collect(Collectors.partitioningBy(s -> s.getFare() > 20));
        System.out.println("\nPartitioned (Peak vs Non-Peak): " + partitioned);

        // 5. Emergency Scenario – Marker Interface
        System.out.println("\n--- Emergency Services ---");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> System.out.println("Emergency Service Active: " + s.getName()));
    }
}
