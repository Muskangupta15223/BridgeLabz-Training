package com.optionalclass.bankingapplication;

public class Loan {

    private String loanType;

    public Loan(String loanType) {
        this.loanType = loanType;
    }

    public String getLoanType() {
        return loanType;
    }
}