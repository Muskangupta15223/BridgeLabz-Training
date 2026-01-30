package com.functionalinterface.multivehicalrental;

public class Main {

	public static void main(String args[]) {
		
		Car car = new Car();
		Bike bike = new Bike();
		Bus bus = new Bus();
		
		car.rent();
		System.out.println("Bike returned : " + bike.isReturn);
		car.returnVehicle();
		bus.rent();
		System.out.println("Bus returned : " + bus.isReturn);
	}
}
