package com.budgetwise;

import java.util.List;
public class MonthlyBudget extends Budget implements IAnalyzable {
	
    private String month;

    public MonthlyBudget(String month, double income,double mainlimit,List<CategoryData> categoryLimits) {
        super(income, mainlimit, categoryLimits);
        this.month = month;
    }

	@Override
    public void generateReport() {
        System.out.println("---- Monthly Report : " + month + " ----");
        System.out.println("Income : " + income);
        System.out.println("Expenses : " + totalExpenses());
        System.out.println("Savings : " + netSavings());
    }

    @Override
    public boolean detectOverspend() {
        return totalExpenses() > mainlimit;
    }
}
