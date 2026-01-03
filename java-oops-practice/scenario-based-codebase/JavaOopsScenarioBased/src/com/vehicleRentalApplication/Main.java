package com.vehicleRentalApplication;

public class Main {

	public static void main(String args[]) {
		
		Customer c1 = new Customer(1, "Muskan");
		Customer c2 = new Customer(2, "Krishna");
		Customer c3 = new Customer(3, "Soumya");
		
		Vehicle v1 = new Bike("M-80" , 1234 , 350);
		Vehicle v2 = new Car("Thar" , 420 , 1000);
		Vehicle v3 = new Truck("Loading Truck" ,51234 , 3000);
		
		c1.rentVehicle(v2, 2);
		System.out.println(c1.getName());
		
		System.out.println("------------");
		c2.rentVehicle(v1, 3);
		System.out.println(c2.getName());

		
		System.out.println("------------");
		c3.rentVehicle(v3, 5);
		System.out.println(c3.getName());

		
		System.out.println("------------");
	}
	
}
