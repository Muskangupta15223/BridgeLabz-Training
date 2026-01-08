package com.MediStore;

import java.time.*;
public class Injection extends Medicine {
		
	public Injection(String name, double price, String expiry, int quantity) {
		super(name, price, expiry, quantity);
	}

	@Override
	public double sell(int qty){
		double totalprice =  getPrice() * qty;
		return totalprice;
	}

	@Override
	public boolean checkExpiry(String curr) {
	    LocalDate currentDate = LocalDate.parse(curr);
	    LocalDate expiryDate = LocalDate.parse(getExpiry()); // 👈 convert here
	    return currentDate.isAfter(expiryDate);
	}


}
