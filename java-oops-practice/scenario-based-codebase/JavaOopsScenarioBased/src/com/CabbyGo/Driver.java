package com.CabbyGo;

public class Driver implements IRideServices {
	private String name;
	private String license;
	private double rating ;
	private double fare ;	
	
	private Vehicle vehicle;
	Driver(String name,String license ,double rating , Vehicle vehicle){
		this.name = name;
		this.license = license;
		this.rating =rating;
	    this.vehicle = vehicle;
	}

    @Override
    public void bookRide(double distance) {
        fare = vehicle.calculateFare(distance);
        System.out.println("Ride booked with " + vehicle.getVehicleDetails());
        System.out.println("Driver: " + name);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Estimated Fare: ₹" + fare);
    }

    @Override
    public void endRide() {
        System.out.println("Ride ended.");
        System.out.println("Final Fare: ₹" + fare);
    }
    
	public double getRating() {
		return rating;
	}


}
