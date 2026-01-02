package com.hospitalPatientManagementSystem;

class Bill implements Payable {

    private double amount;
    private double tax;
    private double discount;

    public Bill(double amount, double tax, double discount) {
        this.amount = amount;
        this.tax = tax;
        this.discount = discount;
    }
    
	@Override
    public double calculatePayment() {
        return amount + (amount * tax) - discount;
    }
}
