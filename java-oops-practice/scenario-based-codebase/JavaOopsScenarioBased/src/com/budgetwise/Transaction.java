package com.budgetwise;

import java.time.LocalDate;

public class Transaction {

    private double amount;
    private TransactionType type;
    private LocalDate date;
    private String category;

    public Transaction(double amount, TransactionType type,
                       LocalDate date, String category) {
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }
}
