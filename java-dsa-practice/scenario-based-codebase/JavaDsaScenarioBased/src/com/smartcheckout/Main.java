package com.smartcheckout;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		ItemStore store = new ItemStore();
		// add item price 
		store.addItem("DETERGENT", 120);
		store.addItem("SOAP", 20);
		store.addItem("RICE", 50);
		store.addItem("OIL", 110);
		store.addItem("SUGAR", 35);
		store.addItem("JAM", 65);
		store.addItem("BREAD", 15);
		
		// add stocks of that items
		store.addStock("DETERGENT", 20);
		store.addStock("SOAP", 10);
		store.addStock("RICE", 50);
		store.addStock("OIL", 30);
		store.addStock("SUGAR", 15);
		store.addStock("JAM", 5);
		store.addStock("BREAD", 25);
		
		Customer c1 = new Customer("Muskan", 1,  Arrays.asList("RICE", "OIL", "SUGAR"));
		Customer c2 = new Customer("Krishna",2,  Arrays.asList("BREAD", "RICE", "JAM"));
		Customer c3 = new Customer("Soumya", 3,  Arrays.asList("DETERGENT", "SOAP", "SUGAR"));
		
		   BillingSystem billing = new BillingSystem(store);
	        billing.addCustomer(c1);
	        billing.addCustomer(c2);
	        billing.addCustomer(c3);
	       	        
	        c1.display();
	        billing.processNextCustomer();
	        System.out.println("-------\n");
	        c2.display();
	        billing.processNextCustomer();
	        System.out.println("-------\n");
	        c3.display();
	        billing.processNextCustomer();
	        System.out.println("-------\n");
	        
	}

}
