package com.lambdaexpression.customsortingecommerce;

public class Product extends Object{

	String name;
	double price;
	double rating;
	double discount;
	
	Product(String name, double price, double rating, double discount){
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discount = discount;
	}
	@Override
	public String toString() {
		return " Name : "+ name + ", Price : " + price + " ,Rating : " + rating + " ,Discount : " + discount + "%";
		
	}
}
