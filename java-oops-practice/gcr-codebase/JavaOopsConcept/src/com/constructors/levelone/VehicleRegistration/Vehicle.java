package com.constructors.levelone.VehicleRegistration;

public class Vehicle{
	
	String ownerName;
	String vehicleType;
	
	static int registrationFee = 500;
	
		Vehicle(String name, String type){
			ownerName = name;
			vehicleType = type;
		}
	
		void displayVehicleDetails() {
			System.out.println("Owner name :" + ownerName);
			System.out.println("vehicle type :" + vehicleType);
			System.out.println("Registration fees: " + registrationFee);
		}
	
		static void updateRegistrationFee(int newFee){
			registrationFee = newFee;
		}	
}
