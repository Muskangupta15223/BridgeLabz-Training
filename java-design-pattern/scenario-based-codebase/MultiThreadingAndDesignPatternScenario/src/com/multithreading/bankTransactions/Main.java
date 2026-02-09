package com.multithreading.bankTransactions;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Bank bank = new Bank();
		bank.addAccount(1001, 1000);
		bank.addAccount(1002, 1500);

		Customer c1 = new Customer(1, bank, 1001,
				new Customer.Type[] { Customer.Type.DEPOSIT, Customer.Type.WITHDRAW, Customer.Type.DEPOSIT },
				new int[] { 300, 200, 150 });

		Customer c2 = new Customer(2, bank, 1001,
				new Customer.Type[] { Customer.Type.WITHDRAW, Customer.Type.WITHDRAW, Customer.Type.DEPOSIT },
				new int[] { 400, 600, 250 });

		Customer c3 = new Customer(3, bank, 1002, new Customer.Type[] { Customer.Type.WITHDRAW, Customer.Type.DEPOSIT },
				new int[] { 500, 700 });

		c1.start();
		c2.start();
		c3.start();

		c1.join();
		c2.join();
		c3.join();

		System.out.println("Final balance for 1001: " + bank.getBalance(1001));
		System.out.println("Final balance for 1002: " + bank.getBalance(1002));
	}
}
