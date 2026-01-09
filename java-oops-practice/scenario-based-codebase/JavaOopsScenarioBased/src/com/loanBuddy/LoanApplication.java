package com.loanBuddy;

public class LoanApplication implements IApprovable {

	String loanType;
	double term;
	double interestRate;
	
	LoanApplication(String loanType, double term, double interestRate){
	    this.loanType = loanType;
		this.term = term;
		this.interestRate = interestRate;
	}
	
	public void approveLoan(Applicant a1) {
		if(a1.getCreditScore() > 700) {
			System.out.println("Approved Loan...... ");
		}
		else {
			System.out.println("Not Approved Loan due to low creditScore");
		}
		
	}
	
	public void calculateEMI(Applicant a1) {
		return;
	}

}