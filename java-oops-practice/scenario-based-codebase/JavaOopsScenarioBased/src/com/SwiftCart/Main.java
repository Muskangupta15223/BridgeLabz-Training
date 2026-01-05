package com.SwiftCart;

public class Main {
	public static void main(String[] args) {

        Product milk = new PerishableProduct("Milk", 50);
        Product rice = new NonPerishableProduct("Rice", 200);

        Cart cart = new Cart();
        cart.addProduct(milk);
        cart.addProduct(rice);

        cart.applyDiscount(20); 
        cart.generateBill();
    }
}
