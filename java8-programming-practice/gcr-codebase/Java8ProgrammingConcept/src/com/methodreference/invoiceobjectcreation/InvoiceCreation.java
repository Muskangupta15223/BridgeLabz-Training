package com.methodreference.invoiceobjectcreation;

import java.util.Arrays;
import java.util.List;

public class InvoiceCreation {

    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
                new Transaction(101, "2025-12-25"),
                new Transaction(121, "2025-12-27"),
                new Transaction(103, "2025-12-29")
        );

        List<Invoice> invoices = transactions.stream()
                .map(Invoice::new)   
                .toList();

        invoices.forEach(System.out::println);
    }
}
