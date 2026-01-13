package com.budgetwise;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<CategoryData> categories = new ArrayList<>();
        categories.add(new CategoryData("Food", 5000));
        categories.add(new CategoryData("Rent", 10000));

        MonthlyBudget mb = new MonthlyBudget(
                "January", 50000, 20000, categories);

        mb.addTransaction(new Transaction(
                3000, TransactionType.EXPENSE,
                LocalDate.now(), "Food"));

        mb.addTransaction(new Transaction(
                8000, TransactionType.EXPENSE,
                LocalDate.now(), "Rent"));

        mb.generateReport();
        System.out.println("Overspent? " + mb.detectOverspend());
    }
}
