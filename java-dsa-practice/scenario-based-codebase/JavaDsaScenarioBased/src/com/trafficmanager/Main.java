package com.trafficmanager;

public class Main {

	public static void main(String args[]) {
		
		   TrafficManager manager = new TrafficManager(3, 5);

	        manager.enterVehicle(101);
	        manager.enterVehicle(102);
	        manager.enterVehicle(103);
	        manager.enterVehicle(104); // goes to queue

	        manager.showStatus();

	        manager.exitVehicle(102);

	        manager.showStatus();
	    }
}
