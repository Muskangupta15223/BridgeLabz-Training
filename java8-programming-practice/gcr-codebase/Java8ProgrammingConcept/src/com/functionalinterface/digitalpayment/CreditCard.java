package com.functionalinterface.digitalpayment;

public class CreditCard implements IPayable {

	public void pay() {
		System.out.println("Pay through CreditCard");
	}
}
