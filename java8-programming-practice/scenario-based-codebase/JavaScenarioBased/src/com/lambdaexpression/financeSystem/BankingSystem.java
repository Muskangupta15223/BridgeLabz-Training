package com.lambdaexpression.financeSystem;

import java.util.Arrays;
import java.util.List;
public class BankingSystem {
// 5.Use lambda to compare two account balances.
	public static void main(String args[]) {
		List<Account> accounts = Arrays.asList(
				new Account(101, "Ashish", 15000),
				new Account(102, "Bittu", 8000),
				new Account(103, "Chanchal", 12000),
				new Account(104, "Diya", 5000),
				new Account(105, "Eram", 20000)
				);
		System.out.println(" Accounts with balance below minimum :- ");
		accounts.stream()
				.filter(a -> a.getBalance() < 10000)
		        .forEach(a -> 
		            System.out.println("Account " + a.getAccountNumber() + 
		                               " (" + a.getAccountName() + 
		                               ") has balance below minimum: " + a.getBalance())
		        );
		System.out.println("\n Calculate Interest for all accounts :- ");
		accounts.stream()
				.forEach(a -> {
						double interest = a.getBalance() * 0.04;
						System.out.println("Account " + a.getAccountNumber() +
											" -> Interest : "+ interest );
					});
		
		System.out.println("\n check valid withdrawl amount");
		double withdrawlAmount = 9000;
		accounts.stream()
				.forEach(a->{
					boolean isValid = withdrawlAmount <= a.getBalance();
					System.out.println("Account " + a.getAccountNumber() +
										" withdrawl of rs " + withdrawlAmount + 
										(isValid ? " is Valid" : " is Not Valid"));
				});
		
		System.out.println("\n Print account details");
		accounts.forEach(System.out::println);
		
			System.out.println(" Comparing two account balances :- ");
		for (int i = 0; i < accounts.size() - 1; i++) {
		    Account acc1 = accounts.get(i);
		    Account acc2 = accounts.get(i + 1);

		    int result = Double.compare(acc1.getBalance(), acc2.getBalance());
		    if (result > 0) {
		        System.out.println(
		            "Account " + acc1.getAccountNumber() + " has higher balance than Account " + acc2.getAccountNumber()
		        );
		    } else if (result < 0) {
		        System.out.println(
		            "Account " + acc2.getAccountNumber() + " has higher balance than Account " + acc1.getAccountNumber()
		        );
		    } else {
		        System.out.println(
		            "Account " + acc1.getAccountNumber() + " and Account " + acc2.getAccountNumber() + " have equal balances"
		        );
		    }
		}
	}
}
