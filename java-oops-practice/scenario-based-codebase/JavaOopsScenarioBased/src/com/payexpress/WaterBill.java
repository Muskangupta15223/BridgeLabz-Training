package com.payexpress;

public class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate, 30);
    }

	@Override
	public void sendRemainder() {
		System.out.println("Water Bill due on " + dueDate +
                ". Please pay to avoid penalties.");
	}
}