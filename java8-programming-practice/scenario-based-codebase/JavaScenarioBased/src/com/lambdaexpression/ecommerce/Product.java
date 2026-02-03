package com.lambdaexpression.ecommerce;

public class Product {

	private String name;
	private double price;
	private int discount;
	
	public Product(String name, double price, int discount){
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getDiscount() {
		return discount;
	}
	
	@Override 
	public String toString() {
		return "Name : " + name + ", Price : " + price + ", discount : " + discount;
	}
}
