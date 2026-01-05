package com.SwiftCart;

class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    @Override
    public double getDiscount() {
        return 0.05; // 5% discount
    }
}

