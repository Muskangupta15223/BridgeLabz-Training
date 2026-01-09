package com.loanBuddy;

public class Applicant {

	String name;
	private int creditScore;
	int income;
	int loanAmount;
	
	Applicant(String name, int income, int loanAmount){
		this.name = name;
		this.income = income;
		this.loanAmount = loanAmount;
	}
	
	public void setCreditScore(int creditScore){
		this.creditScore = creditScore;
	}
	
	public int getCreditScore() {
		return creditScore;
	}
	
	public void showDetails() {
		System.out.println("Name             : " + name);
		System.out.println("Credit Score     : " + getCreditScore());
		System.out.println("income           : " + income);
		System.out.println("LoanAmount       : " + loanAmount);
	}
}