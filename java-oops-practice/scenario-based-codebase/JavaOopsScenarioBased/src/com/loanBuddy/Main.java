package com.loanBuddy;
import java.util.*;
public class Main {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("            WELCOME TO LOAN BUDDY          ");
	        System.out.println("===========================================\n");
	        System.out.print("Enter Applicant Name        : ");
	        String name = sc.nextLine();

	        System.out.print("Enter Monthly Income        : ");
	        int income = sc.nextInt();

	        System.out.print("Enter Requested Loan Amount : ");
	        int amount = sc.nextInt();

	        System.out.print("Enter Credit Score          : ");
	        int creditScore = sc.nextInt();

	        System.out.println("\n----------- Select Loan Type -----------");
	        System.out.println("1️)  Home Loan");
	        System.out.println("2️)  Auto Loan");
	        System.out.println("3️)  Personal Loan");
	        System.out.print("Enter choice (1-3): ");
	        int choice = sc.nextInt();

	        LoanApplication loan = null;

	        switch (choice) {
	            case 1:
	                loan = new HomeLoan("Home Loan", 8.5, 20);
	                break;
	            case 2:
	                loan = new AutoLoan("Auto Loan", 7.2, 7);
	                break;
	            case 3:
	                loan = new LoanApplication("Personal Loan", 12.0, 5);
	                break;
	            default:
	                System.out.println("Invalid Choice!");
	                System.exit(0);
	        }

	        Applicant applicant =
	                new Applicant(name, income, amount);
	        applicant.setCreditScore(creditScore);

	        System.out.println("            APPLICANT DETAILS            ");
	        System.out.println("===========================================");
	        applicant.showDetails();

	        System.out.println("             LOAN PROCESSING              ");
	        System.out.println("===========================================");

	        loan.approveLoan(applicant);
	        loan.calculateEMI(applicant);

	        System.out.println("\n   Thank you for using Loan Buddy!");
	        System.out.println("===========================================\n");

	        sc.close();
	}
}
