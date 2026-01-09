package com.FoodLoop;

public class VegItem extends FoodItem {

    public VegItem(String name, double price, int stock) {
        super(name, "Non-Veg", price, stock);
    }
}
