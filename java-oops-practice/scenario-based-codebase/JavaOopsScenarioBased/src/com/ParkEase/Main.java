package com.ParkEase;

public class Main{
	
    public static void main(String[] args) {

        ParkingManager manager = new ParkingManager();

        manager.addSlot(new ParkingSlot("S1"));
        manager.addSlot(new ParkingSlot("S2"));

        Vehicle car = new Car("MP-04-1111");
//        Vehicle bike = new Bike("MP-9693");

        ParkingSlot slot = manager.assignSlot(car);
//        manager.assignSlot(bike);
        manager.showStatus();

        double bill = manager.releaseSlot(slot, 3);
        System.out.println("Parking Charge: Rs " + bill);
    }
}