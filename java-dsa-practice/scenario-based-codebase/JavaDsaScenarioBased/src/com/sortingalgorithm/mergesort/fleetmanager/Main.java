package com.sortingalgorithm.mergesort.fleetmanager;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Depot depot1 = new Depot();
        Depot depot2 = new Depot();

        System.out.println("Enter number of vehicles in Depot 1:");
        int n1 = sc.nextInt();

        System.out.println("Enter vehicleId and mileage (sorted by mileage):");
        for (int i = 0; i < n1; i++) {
            depot1.addVehicle(new Vehicle(sc.nextInt(), sc.nextInt()));
        }

        System.out.println("Enter number of vehicles in Depot 2:");
        int n2 = sc.nextInt();

        System.out.println("Enter vehicleId and mileage (sorted by mileage):");
        for (int i = 0; i < n2; i++) {
            depot2.addVehicle(new Vehicle(sc.nextInt(), sc.nextInt()));
        }

        List<Vehicle> masterSchedule =
        FleetManager.mergeLists(depot1.getVehicles(), depot2.getVehicles());

        System.out.println("\nMaster Maintenance Schedule:");
        for (Vehicle v : masterSchedule) {
            System.out.println(v);
        }

        sc.close();
    }
}
