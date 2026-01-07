package com.ParkEase;

public abstract class Vehicle implements IPayable {
	
	private String type;
	private String model;
    protected double baseRate;
	
	Vehicle(String type, String model, double baseRate){
		this.type = type;
		this.model = model;
		this.baseRate = baseRate;
	}
	public abstract double calculateCharges(double duration);
	
	public String getType() {
		return type;
	}
	
}
