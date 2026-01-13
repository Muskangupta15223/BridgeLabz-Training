package com.budgetwise;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    protected double income;
    protected double mainlimit;
    protected List<CategoryData> categoryLimits;
    protected List<Transaction> transactions;

    public Budget(double income, double mainlimit,
                  List<CategoryData> categoryLimits) {
        this.income = income;
        this.mainlimit = mainlimit;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    protected double totalExpenses() {
        double sum = 0;
        for (Transaction t : transactions) {
            if (t.getType() == TransactionType.EXPENSE) {
                sum += t.getAmount();
            }
        }
        return sum;
    }

    // Operator usage
    public double netSavings() {
        return income - totalExpenses();
    }
}