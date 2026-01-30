package com.functionalinterface.digitalpayment;

public class UPI implements IPayable{

	public void pay() {
		System.out.println("Pay through UPI");
	}
}
