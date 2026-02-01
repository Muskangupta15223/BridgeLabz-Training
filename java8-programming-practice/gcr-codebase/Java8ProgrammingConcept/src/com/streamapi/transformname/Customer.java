package com.streamapi.transformname;

public class Customer {

	private String name;
	private double billAmount;
	
	Customer(String name, double billAmount){
		this.name = name;
		this.billAmount = billAmount;
	}

	public String getName() {
		return name;
	}
	public double getBillAmount() {
		return billAmount;
	}
	@Override
	public String toString() {
		return name + " | Bill Amount: " + billAmount +"\n" ;
	}
}
