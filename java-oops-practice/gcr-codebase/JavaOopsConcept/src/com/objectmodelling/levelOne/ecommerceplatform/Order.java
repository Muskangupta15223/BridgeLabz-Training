package com.objectmodelling.levelOne.ecommerceplatform;
import java.util.*;
public class Order {
    int orderId;
    List<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println(" Product: " + p.productName + " ₹" + p.price);
        }
    }
}
