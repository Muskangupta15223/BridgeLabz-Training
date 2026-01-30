package com.lambdaexpression.customsortingecommerce;

import java.util.Arrays;
import java.util.List;

public class CustomSortingEcommerce {

	public static void main(String args[]) {

		List<Product> product = Arrays.asList(
				   new Product("Mobile", 50000, 3.5, 10),
	                new Product("Laptop", 70000, 4.8, 25),
	                new Product("Tablet", 30000, 2.2, 40)
	        );
		
		product.sort((p1,p2) -> Double.compare(p1.price - p2.price, 0));
	    System.out.println("\n Sorted by Price:");
        product.forEach(System.out :: println);

	    product.sort((p1,p2) -> Double.compare(p2.rating - p1.rating, 0));
    	System.out.println("\n Sorted by Rating:");
		product.forEach(System.out :: println);
		
	    product.sort((p1,p2) -> Double.compare(p2.discount - p1.discount, 0));
    	System.out.println("\n Sorted by Discount:");
		product.forEach(System.out :: println);
		

			   
	}
}
