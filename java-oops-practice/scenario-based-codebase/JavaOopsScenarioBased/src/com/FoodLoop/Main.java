package com.FoodLoop;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		FoodItem burger = new VegItem("Veg Burger", 120, 10);
        FoodItem pizza = new VegItem("Cheese Pizza", 250, 5);
        FoodItem chicken = new NonVegItem("Chicken Wings", 220, 8);

        List<FoodItem> comboMeal = new ArrayList<>();
		     comboMeal.add(burger);
		     comboMeal.add(pizza);
	         comboMeal.add(chicken);

	    Order order = new Order(comboMeal);

        order.showItems();
        order.placeOrder();
	}
}
