package com.vehicleRentalApplication;

public class Vehicle implements Rentable{
	private String vehicleName;
	private int vehicleNumber;
	private double baseRate;
	
	Vehicle(String name, int num, double rate){
		vehicleName = name;
		vehicleNumber = num;
		baseRate = rate;
	}
	
	public String getVehicleName(){
		return vehicleName;
	}
	
	public int getVehicleNumber(){
		return vehicleNumber;
	}

	@Override
	public void calculateRent() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
}
