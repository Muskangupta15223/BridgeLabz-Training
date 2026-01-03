package com.CabbyGo;

public class Sedan extends Vehicle {
	  private final double rate = 65;

	    public Sedan(String vehicleNumber) {
	        super(vehicleNumber, 4, "Sedan");
	    }

	    @Override
	    public double calculateFare(double distance) {
	        double baseFare = 200;
	        return baseFare + distance * rate;
	    }
	}