package com.FoodLoop;
import java.util.*;

public class Order implements IOrderable {

    private List<FoodItem> items = new ArrayList<>();
    private double total;

    // constructor for combo meals
    public Order(List<FoodItem> items) {
        this.items = items;
        calculateTotal();
    }

	private void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.getPrice(); 
        }
        applyDiscount(); 
    }


    public void applyDiscount() {
        if (total >= 500) {
            total -= 100;
        } else if (total >= 300) {
            total -= 50;
        }
    }

    @Override
    public void placeOrder() {
        System.out.println("Order placed successfully!");
        System.out.println("Total amount: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled.");
    }

    public void showItems() {
        for (FoodItem item : items) {
            item.displayItem();
        }
    }
}
