package com.BookBazar;

class Order {
    private static int counter = 1001;
    private int orderId;
    private double totalAmount;
    private String status;

    public Order() {
        this.orderId = counter++;
        this.status = "CREATED";
    }

    // Restricted status update
    private void updateStatus(String newStatus) {
        status = newStatus;
    }

    public void placeOrder(Book book, int quantity) {
        if (book.getStock() < quantity) {
            System.out.println("Order failed: insufficient stock");
            return;
        }

        double discount = 0;
        if (book instanceof IDiscountable) {
            discount = ((IDiscountable) book).applyDiscount(quantity);
        }

        totalAmount = (book.getPrice() * quantity) - discount;
        book.updateStock(quantity);
        updateStatus("CONFIRMED");

        System.out.println("Order placed successfully!");
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

}