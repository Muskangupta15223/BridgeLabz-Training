package com.functionalinterface.smartvehicledashboard;

public class SmartVehicleMain {

	public static void main(String arg[]) {
		
		IVehicle bike = (speed) -> System.out.println("Speed of bike : " + speed);
		IVehicle auto = (speed) -> System.out.println("Speed of auto : " + speed);
		IVehicle ev = (speed) -> System.out.println("Speed of electric vehicle : " + speed);
		
		bike.displaySpeed(120);
		auto.displaySpeed(180);
		
		ev.displaySpeed(150);
		ev.displayBattery(93);
	
	
	}
}
