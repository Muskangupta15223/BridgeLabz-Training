package com.CabbyGo;

public class SUV extends Vehicle {
	 private final double rate = 70;

	  public SUV(String vehicleNumber) {
	      super(vehicleNumber, 6, "SUV");
	   }

      @Override
	  public double calculateFare(double distance) {
	   double baseFare = 220;
       return baseFare + distance * rate;
	 }
}
