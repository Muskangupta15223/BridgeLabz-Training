package com.vehicleRentalApplication;

public class Truck extends Vehicle{
	private int loadCharge = 2000;
	
	Truck(String name, int num, double rate) {
		super(name, num, rate);
	}
	
	public double calculateRent(double rate , int days) {
		return (rate + loadCharge) * days;
	}
	
	
}
