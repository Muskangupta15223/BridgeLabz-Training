package com.sortingalgorithm.mergesort.ZipZipMart;

public class Transaction {

	private String date;
	private double amount;
	
	Transaction(String date, double amount){
		this.date = date;
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}
	
}
