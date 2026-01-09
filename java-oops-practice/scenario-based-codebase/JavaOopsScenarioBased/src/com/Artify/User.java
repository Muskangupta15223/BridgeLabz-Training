package com.Artify;

public class User {
	private String userName;
	private double walletBalance;
	
	User(String userName, double walletBalance){
		this.userName = userName;
		this.walletBalance = walletBalance;
	}
	
	public String getUserName() {
		return userName;
	}
	public double getWalletBalance() {
		return walletBalance;
	}
	public double updateWallet(double price) {
		walletBalance -= price;
		return walletBalance;
	}
	
	public void displayInfo() {
		System.out.println("Name :" + userName);
		System.out.println("wallet balance :" + walletBalance);
	}
	
}
