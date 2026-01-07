package com.ParkEase;

public class Truck extends Vehicle{
	private static final double penalty = 30;
	
	 Truck(String model) {
		super("Truck", model, 120);
	 }
	 
	 public double calculateCharges(double hrs) {
			double charge = hrs * baseRate;
			if(hrs >= 2) {
				charge += penalty;
			}
			return charge;
	  }	 
}
