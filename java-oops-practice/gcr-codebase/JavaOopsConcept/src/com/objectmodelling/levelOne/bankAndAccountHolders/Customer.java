package com.objectmodelling.levelOne.bankAndAccountHolders;

class Customer {
	
 private String name;
 private double balance;
 private Bank bank; // Association: Customer is linked to a Bank

 public Customer(String name, Bank bank) {
     this.name = name;
     this.bank = bank;
     this.balance = 0.0; // initial balance
 }

 // Deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println(name + " deposited $" + amount + ". New balance: $" + balance);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 // Withdraw money
 public void withdraw(double amount) {
     if (amount <= balance && amount > 0) {
         balance -= amount;
         System.out.println(name + " withdrew $" + amount + ". Remaining balance: $" + balance);
     } else {
         System.out.println("Insufficient balance or invalid amount.");
     }
 }

 // View balance
 public void viewBalance() {
     System.out.println(name + "'s balance in " + bank.getBankName() + ": $" + balance);
 }

 public String getName() {
     return name;
 }

 public Bank getBank() {
     return bank;
 }
}
