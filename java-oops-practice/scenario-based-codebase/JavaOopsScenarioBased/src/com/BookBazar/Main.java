package com.BookBazar;

public class Main {

  public static void main(String[] args) {
    // Create books
    Book ebook = new EBook("Java Mastery", "James Gosling", 500, 10);
    Book pbook = new PrintedBook("Clean Code", "Robert C. Martin", 800, 5);

    // Create orders
    Order order1 = new Order();
    order1.placeOrder(ebook, 2);

    System.out.println("Order ID: " + order1.getOrderId());
    System.out.println("Total Amount: ₹" + order1.getTotalAmount());

    System.out.println("--------------------------------");

    Order order2 = new Order();
    order2.placeOrder(pbook, 1);

    System.out.println("Order ID: " + order2.getOrderId());
    System.out.println("Total Amount: ₹" + order2.getTotalAmount());
  }
}
