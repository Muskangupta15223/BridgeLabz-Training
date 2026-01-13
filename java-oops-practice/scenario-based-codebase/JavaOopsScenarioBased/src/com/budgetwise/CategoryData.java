package com.budgetwise;

public class CategoryData {

    private String name;
    private double limit;

    public CategoryData(String name, double limit) {
        this.name = name;
        this.limit = limit;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }
}
