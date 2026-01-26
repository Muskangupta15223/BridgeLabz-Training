package com.collection.junit;

public class BankAccount {

	private double balance;
	
	BankAccount(double balance){
		this.setBalance(balance);	
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}
	
	public void withdraw(double amount) {
		if(balance < amount) {
			throw new IllegalArgumentException("Insufficient Balance");
		}
		setBalance(getBalance() - amount);
	}
}
