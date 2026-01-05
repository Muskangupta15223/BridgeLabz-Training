package com.SwiftCart;
import java.util.*;

class Cart implements ICheckout {

    private List<Product> products;
    private double totalPrice;

    // Empty cart
    public Cart() {
        products = new ArrayList<>();
    }

    // Pre-filled cart
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    // Only Cart can update price
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    @Override
    public void applyDiscount(double coupon) {
        double discount = 0;
        for (Product p : products) {
            discount += p.getPrice() * p.getDiscount();
        }
        totalPrice = totalPrice - discount - coupon;
    }

    @Override
    public void generateBill() {
        System.out.println("---- SwiftCart Bill ----");

        for (Product p : products) {
            System.out.println(p.getName() + " : ₹" + p.getPrice());
        }
        System.out.println("Total Amount: ₹" + totalPrice);
    }
}
