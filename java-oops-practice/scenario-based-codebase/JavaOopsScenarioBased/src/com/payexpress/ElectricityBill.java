package com.payexpress;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate, 50);
    }

	@Override
	public void sendRemainder() {
		System.out.println("Electricity Bill due on " + dueDate +
                ". Power may be disconnected!");
	}
}