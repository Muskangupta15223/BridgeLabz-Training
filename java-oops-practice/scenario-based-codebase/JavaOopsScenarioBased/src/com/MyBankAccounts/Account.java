package com.MyBankAccounts;

public abstract class Account implements ITransaction {
	private String accountNumber;
	private double balance;
	Account(String accountNumber, double balance){
		this.setAccountNumber(accountNumber);
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public void deposits(double amount) {
		System.out.println(amount + " amount deposited ...");
		balance += amount;
		
	}
	@Override
	public void withdraw(double amount) {
		System.out.println(amount + " amount withdrawn ...");
		balance -= amount;
		
	}
	@Override
	public double checkBalance() {
		return balance;
	}
	
	public void accountDetails() {
		System.out.println("Account Number :" + accountNumber);
		System.out.println("Total Balance :" + balance);
		
	}
	public abstract double calculateInterest(); 
	
}
