package com.payexpress;

public class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate, 70);
    }

    @Override
    public void sendRemainder() {
        System.out.println("Internet Bill due on " + dueDate +
                ". Service interruption possible!");
    }
}