package com.objectmodelling.levelOne.ecommerceplatform;
class Customer {
    String customerName;

    Customer(String customerName) {
        this.customerName = customerName;
    }

    Order placeOrder(int orderId) {
        System.out.println(customerName + " placed order " + orderId);
        return new Order(orderId);
    }
}