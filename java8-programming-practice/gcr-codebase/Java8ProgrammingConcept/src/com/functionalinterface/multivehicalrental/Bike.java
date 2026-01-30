package com.functionalinterface.multivehicalrental;

public class Bike implements IVehicle {

	boolean isRent = false;
	boolean isReturn = false;
	@Override
	public boolean rent() {
		System.out.println("Bike is rented");
		isRent = true;
		return isRent;
	}

	@Override
	public boolean returnVehicle() {
		System.out.println("Bike is returned");
		isReturn = true;
		return isReturn;
	}

}
