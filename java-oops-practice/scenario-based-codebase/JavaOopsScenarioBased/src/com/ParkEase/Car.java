package com.ParkEase;

public class Car extends Vehicle{
	private static final double penalty = 50;
	
	Car( String model) {
		super("Car", model, 100);
	}
	
	@Override
	public double calculateCharges(double hrs) {
		double charge = hrs * baseRate;
		if(hrs >= 2) {
			charge += penalty;
		}
		return charge;
	}
}
