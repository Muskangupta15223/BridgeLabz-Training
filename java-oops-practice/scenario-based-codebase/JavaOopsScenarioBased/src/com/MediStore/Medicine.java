package com.MediStore;

import java.time.LocalDate;
public abstract class Medicine implements ISellable{
	private String name;
	private double price;
	private String expiry;
	private int quantity;
	
	public Medicine(String name, double price, String expiry, int quantity) {
		this.name = name;
		this.price = price;
		this.expiry = expiry;
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public String getExpiry() {
		return expiry;
	}
	public int getQuantity() {
		return quantity;
	}
	public boolean updateQuantity(int qty) {
	    if (qty <= 0) {
	        return false;
	    }

	    if (this.quantity >= qty) {
	        this.quantity -= qty;
	        return true;
	    }
	    return false;
	}
	public String getName() {
		return name;
	}
	public void displayInfo() {
		System.out.println("Name :" + name);
		System.out.println("Price :" + price);
		System.out.println("Expry :" + expiry);
		
	}
	public abstract double sell(int quantity);
	public abstract boolean checkExpiry(String d);
}
