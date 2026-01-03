package com.CabbyGo;

public abstract class Vehicle {

	protected String vehicleNumber;
	protected int capacity;
	protected String type;
	
	Vehicle(String vehicleNumber,int capacity ,	String type){
		this.vehicleNumber= vehicleNumber;
		this.capacity = capacity;
		this.type = type;
	}

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return type + " [" + vehicleNumber + "]";
    }
}
