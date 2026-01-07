package com.ParkEase;

public class Bike extends Vehicle{
	private static final double penalty = 30;
	
	Bike(String model) {
		super("Bike", model, 40);
		
	}
	public double calculateCharges(double hrs) {
		double charge = hrs * baseRate;
		if(hrs >= 2) {
			charge += penalty;
		}
		return charge;
	}
}

