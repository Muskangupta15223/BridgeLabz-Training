package com.streamapi.transformname;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformMain {

	public static void main(String args[]) {
		List<Customer> customer = Arrays.asList(
		 new Customer("Muskan", 2500.0),
		 new Customer("Ragini", 1800.0),
		 new Customer("Manav", 3200.0),
		 new Customer("Karan", 1500.0),
		 new Customer("Anita", 2800.0)
		);
		
		List<String>customerName =
				customer.stream()
						.map(Customer :: getName)
						.map(String :: toUpperCase)
						.collect(Collectors.toList());
		System.out.println(customerName);
	}
}
