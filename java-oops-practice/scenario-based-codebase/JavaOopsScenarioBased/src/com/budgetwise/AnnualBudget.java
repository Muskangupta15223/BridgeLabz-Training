package com.budgetwise;

import java.util.List;

public class AnnualBudget extends Budget implements IAnalyzable {

    private int year;

    public AnnualBudget(int year, double income,double mainlimit,List<CategoryData> categoryLimits) {
        super(income, mainlimit, categoryLimits);
        this.year = year;
    }

    @Override
    public void generateReport() {
        System.out.println("==== Annual Report : " + year + " ====");
        System.out.println("Total Income : " + income);
        System.out.println("Total Expenses : " + totalExpenses());
        System.out.println("Total Savings : " + netSavings());
    }

    @Override
    public boolean detectOverspend() {
        return totalExpenses() > mainlimit;
    }
}