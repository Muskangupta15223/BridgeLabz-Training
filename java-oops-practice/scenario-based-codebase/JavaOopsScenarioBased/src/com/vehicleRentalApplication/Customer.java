package com.vehicleRentalApplication;

public class Customer {
	private int custId;
	private String name;
	
	Customer(int custId, String name){
		this.custId = custId;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return custId;
	}
	
	public void rentVehicle(Vehicle v, int days){
		System.out.println(v.getVehicleName() + " is booked for " + days + "days");
	}
}
