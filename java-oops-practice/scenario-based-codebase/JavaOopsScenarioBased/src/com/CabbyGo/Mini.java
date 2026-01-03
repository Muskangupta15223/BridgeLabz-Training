package com.CabbyGo;

public class Mini extends Vehicle {
	double rate = 50;
	 Mini(String vehicleNumber) {
		 super(vehicleNumber,4 ,"Mini");
	 }
	 
	@Override
	public double calculateFare(double distance) {
	     double baseFare = 150;
	     return baseFare + distance * rate;
	    } 
}

