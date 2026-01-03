package com.MyBankAccounts;

public class SavingsAccount extends Account{

	private double interestRate = 3.5; 
	
	SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	public double calculateInterest() {
	    return getBalance() * interestRate / 100;
	}
}
