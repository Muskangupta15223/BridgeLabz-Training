package com.functionalinterface.digitalpayment;

public class Wallet implements IPayable{

	public void pay() {
		System.out.println("Pay through Wallet");
	}
}
