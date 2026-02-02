package com.lambdaexpression.financeSystem;

public class Account {

	private int accountNumber;
	private String accountName;
	private double balance;
	
	Account(int accountNumber, String accountName, double balance){
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public double getBalance() {
		return balance;
	}
	public String toString() {
		return "Account Number : " + accountNumber + 
			   ", Account Name : " + accountName + 
			   ", Balance : " + balance;
	}
}
