package com.objectmodelling.levelOne.bankAndAccountHolders;

public class Main {
	 public static void main(String[] args) {
	        // Create bank
	        Bank sbiBank = new Bank("SBI Bank");

	        // Open accounts for customers
	        sbiBank.openAccount("Alice");
	        sbiBank.openAccount("Bob");

	        // List customers
	        sbiBank.listCustomers();

	        // Access customer objects
	        Customer alice = sbiBank.getCustomers().get(0);
	        Customer bob = sbiBank.getCustomers().get(1);

	        // Transactions
	        alice.deposit(1000);
	        bob.deposit(500);

	        alice.withdraw(200);
	        bob.withdraw(600); // edge case: more than balance

	        // View balances
	        alice.viewBalance();
	        bob.viewBalance();
	    }
	}
