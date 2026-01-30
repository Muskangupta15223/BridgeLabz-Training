package com.functionalinterface.multivehicalrental;

public class Bus implements IVehicle{

	boolean isRent = false;
	boolean isReturn = false;
	@Override
	public boolean rent() {
		System.out.println("Bus is rented");
		isRent = true;
		return isRent;
	}

	@Override
	public boolean returnVehicle() {
		System.out.println("Bus is returned");
		isReturn = true;
		return isReturn;
	}

}
