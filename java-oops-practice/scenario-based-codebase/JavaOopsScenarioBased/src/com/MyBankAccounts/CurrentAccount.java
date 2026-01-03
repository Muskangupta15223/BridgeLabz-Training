package com.MyBankAccounts;

public class CurrentAccount extends Account {

	private double interestRate = 4.5; 
	
	CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public double calculateInterest() {
		 return getBalance() * interestRate / 100;
	}
}

