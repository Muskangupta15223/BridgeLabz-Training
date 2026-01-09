package com.loanBuddy;

public class AutoLoan extends LoanApplication{

	AutoLoan(String type, double term, double interestRate){
		super(type, term,interestRate);
	}
	
	@Override
	public void calculateEMI(Applicant a1) {
		if(a1.getCreditScore() > 700) {
		   double base = interestRate + 1;
		   double emi = (a1.loanAmount * interestRate * Math.pow(base,term)) / (Math.pow(base,term) -1); 
		   System.out.println("\n===========================================");
	       System.out.println("               EMI DETAILS                 ");
	       System.out.println("===========================================");
		   System.out.printf("%-10s %.2f\n","EMI Amount per month : ", (emi / 12));
		   System.out.printf("%-10s %.2f","Total EMI Amount : " , emi);
		}
	}
}
