package com.vehicleRentalApplication;

public class Bike extends Vehicle{

	Bike(String name, int num, double rate) {
		super(name, num, rate);
	}
	
	public double calculateRent(double rate , int days) {
		return rate  * days;
	}

}
