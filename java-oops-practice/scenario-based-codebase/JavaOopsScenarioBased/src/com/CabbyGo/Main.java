package com.CabbyGo;

public class Main {

	public static void main(String[] args) {
		
		  Vehicle v1 = new Mini("MP04AB1234");
	        Vehicle v2 = new Sedan("MH12XY5678");
	        Vehicle v3 = new SUV("DL09PQ9999");

	        Driver d1 = new Driver("Amit", "LIC123", 4.6, v1);
	        Driver d2 = new Driver("Muskan", "LIC456", 4.8, v2);
	        Driver d3 = new Driver("Afroz", "LIC789", 4.9, v3);

	        d1.bookRide(10);
	        d1.endRide();

	        System.out.println("----------------");

	        d2.bookRide(8);
	        d2.endRide();

	        System.out.println("----------------");

	        d3.bookRide(12);
	        d3.endRide();
    }
}
	
