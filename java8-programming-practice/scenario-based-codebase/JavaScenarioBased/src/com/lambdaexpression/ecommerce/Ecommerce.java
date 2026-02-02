package com.lambdaexpression.ecommerce;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ecommerce {

	public static void main(String args[]) {
		
		List<Product> products = Arrays.asList(
				new Product("Laptop", 80000 , 10),
				new Product("Smartphone", 50000 , 5),
				new Product("Tablet", 30000 , 15),
				new Product("Headphones", 5000 , 20),
				new Product("Smartwatch", 12000 , 8)
				);
		
		
		// Apply 10 % discount
		System.out.println("Price After 10 % discount");
		Function<Product, Double>discount = p -> p.getPrice() * 0.90; 
		products.forEach(p -> 
				System.out.println(p.getName() + " : " + discount.apply(p))
		);
		
		// Sort product price
		System.out.println("\n Sort Price of product");
		products.stream()
				.sorted((p1,p2)-> Double.compare(p1.getPrice(), p2.getPrice()))
				.forEach(p -> 
				System.out.println(p.getName() + " : " + p.getPrice())
		);
				
		System.out.println("\n Free Delivery Eligibility:");
	    Predicate<Product> freeDelivery = p -> p.getPrice() > 17000;
	    products.forEach(p ->
	             System.out.println(p.getName() + " → " +
	                    (freeDelivery.test(p) ? "Eligible" : "Not Eligible"))
	        );

	        /* 4. Calculate final bill amount */
	    System.out.println("\n Final Bill Amount (After Discount):");
	    double finalBill = products.stream()
	                               .map(discount)
	                               .reduce(0.0, Double::sum);
	    System.out.println("Total Bill = " + finalBill);

		
		// lambda = print product names
		System.out.println("\n Print names of product");
		Consumer<Product> printNames = 
				p -> System.out.println("Product name : " + p.getName());				
				products.forEach(printNames);	
	}
}
