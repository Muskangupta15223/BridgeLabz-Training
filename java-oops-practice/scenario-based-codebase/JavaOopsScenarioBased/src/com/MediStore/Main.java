package com.MediStore;
public class Main {

	public static void main(String[] args) {
		
	Medicine injection =  new Injection("Insulin", 550.95,"2026-03-15", 20);
	Medicine syrup = new Syrup("Bestocoff", 120.55, "2026-06-20", 10);
	Medicine tablet = new Tablet("Nodard +", 40, "2026-08-17", 15);
	
	// here perform operation for injection
	if(injection.checkExpiry("2025-01-15")) {
		System.out.println("Purchase successfully");
		System.out.println("Total price is : " + injection.sell(5));
	}else {
		System.out.println("Medicine is expired !!");
		System.out.println("We can't purchase it !! \n");
	}
	

if (injection.updateQuantity(5)) {
    System.out.println("Quantity updated successfully");
} else {
    System.out.println("Not enough stock");
}

	injection.displayInfo();
	System.out.println("---------");
	
	syrup.displayInfo();
	System.out.println("---------");
	tablet.displayInfo();
	
	}

}
