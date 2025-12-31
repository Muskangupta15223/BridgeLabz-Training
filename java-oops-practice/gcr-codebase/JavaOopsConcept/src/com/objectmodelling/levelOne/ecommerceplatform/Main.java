package com.objectmodelling.levelOne.ecommerceplatform;

public class Main {

	    public static void main(String[] args) {

	        Customer ram = new Customer("Ram");

	        Product mobile = new Product("Mobile", 15000);
	        Product earbuds = new Product("Earbuds", 2000);

	        Order order1 = ram.placeOrder(101);

	        order1.addProduct(mobile);
	        order1.addProduct(earbuds);

	        order1.showOrderDetails();
	    }
	}
