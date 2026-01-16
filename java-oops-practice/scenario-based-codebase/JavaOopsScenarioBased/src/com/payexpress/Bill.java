package com.payexpress;

abstract class Bill implements IPayable {

    private boolean isPaid;            
    protected String type;
    protected double amount;
    protected String dueDate;
    protected double penalty;

    public Bill(String type, double amount, String dueDate, double penalty) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.penalty = penalty;
        this.isPaid = false;
    }

    protected double calculateTotalAmount() {
        return amount + penalty;   
    }

    public final void pay() {
        if (!isPaid) {
            isPaid = true;
            System.out.println(type + " Bill Paid.\n Amount: " + calculateTotalAmount());
        } 
        else {
            System.out.println(type + " Bill already paid.");
        }
    }

    public boolean isPaid() {
        return isPaid;
    }
}
