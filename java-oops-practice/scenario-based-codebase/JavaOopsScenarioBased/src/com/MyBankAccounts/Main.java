package com.MyBankAccounts;

public class Main {

	public static void main(String[] args) {
		
		Account a1 = new SavingsAccount("123" , 23500.56);
		System.out.println("\nCheck Balance: "+ a1.checkBalance());
		a1.deposits(1200);
		a1.withdraw(300);
		System.out.printf("Calculate Interest : %.3f%n", a1.calculateInterest());
		a1.accountDetails();
		System.out.println("--------------------");

		Account a2 = new CurrentAccount("2233" , 43500.56);
		System.out.println("\nCheck Balance: "+ a2.checkBalance());
		a2.withdraw(1380);
		a2.deposits(15700);
		System.out.printf("Calculate Interest : %.2f%n ", a2.calculateInterest());
		a2.accountDetails();
	}

}
