package com.FoodLoop;

public class FoodItem {

	private String name;
	private String category;
	private double price;
	protected int stock;
	
    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

    protected boolean isAvailable() {
        return stock > 0;
    }
	
    protected void reduceStock() {
        if (stock > 0) {
            stock--;
        }
    }

    public void displayItem() {
        System.out.println(name + " | " + category + " | ₹" + price);
    }
}
