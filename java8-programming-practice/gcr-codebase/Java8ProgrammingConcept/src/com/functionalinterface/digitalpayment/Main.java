package com.functionalinterface.digitalpayment;

public class Main {

	public static void main(String args[]) {
		
		UPI upi = new UPI();
		CreditCard credit = new CreditCard();
		Wallet wallet = new Wallet();
		
		upi.pay();
		credit.pay();
		wallet.pay();
	}
}
