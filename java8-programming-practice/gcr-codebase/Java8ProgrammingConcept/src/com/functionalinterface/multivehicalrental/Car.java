package com.functionalinterface.multivehicalrental;

public class Car implements IVehicle{

	boolean isRent = false;
	boolean isReturn = false;
	@Override
	public boolean rent() {
		System.out.println("Car is rented");
		isRent = true;
		return isRent;
	}

	@Override
	public boolean returnVehicle() {
		System.out.println("Car is returned");
		isReturn = true;
		return isReturn;
	}

}
