package com.functionalinterface.paymentgateway;

public class PaymentGatewayApp {

	 public static void main(String[] args) {
	PaymentProcessor paytm = amount ->  System.out.println("Paytm payment of ₹" + amount + " successful");
	PaymentProcessor gpay = amount ->  System.out.println("Gpay payment of ₹" + amount + " successful");
	PaymentProcessor phonepay = amount ->  System.out.println("Phonepay payment of ₹" + amount + " successful");

	paytm.processPayment(5000);
	paytm.refund(300);
	
	gpay.processPayment(2000);
	
	phonepay.processPayment(2500);
	phonepay.refund(2400);
	 }
}
