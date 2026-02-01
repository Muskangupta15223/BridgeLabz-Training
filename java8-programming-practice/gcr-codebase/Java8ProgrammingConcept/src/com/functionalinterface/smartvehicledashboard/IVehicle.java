package com.functionalinterface.smartvehicledashboard;

public interface IVehicle {

	void displaySpeed(int speed);
		 default void displayBattery(int percentage) {
			 if(percentage <= 0)
		        System.out.println("Battery information not available");
			 else   System.out.println("Battery level : " + percentage);
				
				 
		 }
}
