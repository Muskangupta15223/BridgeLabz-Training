package com.MyBankAccounts;

public interface ITransaction {
	public void deposits(double amount);
	public void withdraw(double amount);
	public double checkBalance();
}
