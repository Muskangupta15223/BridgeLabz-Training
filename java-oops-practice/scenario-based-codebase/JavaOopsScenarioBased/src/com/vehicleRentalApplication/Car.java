package com.vehicleRentalApplication;

public class Car extends Vehicle{

	private int luxuryCharge = 500;	
	Car(String name,int num, double rate) {
		super(name, num, rate);
	}
	
	public double calculateRent(double rate , int days) {
		return (rate + luxuryCharge ) * days;
	}

}
