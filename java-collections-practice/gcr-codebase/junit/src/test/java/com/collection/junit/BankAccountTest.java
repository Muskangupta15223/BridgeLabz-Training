package com.collection.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

	BankAccount account = new BankAccount(5000);
	@Test
	void depositTest() {
		account.deposit(555);
		int expected = 5555;
		Assertions.assertEquals(expected, account.getBalance());
	}
	
	@Test
	void withdrawTest() {
		account.withdraw(500);
		int expected = 4500;
		Assertions.assertEquals(expected,account.getBalance());
		
	}
	  @Test
	    void insufficientBalanceTest() {
	        Assertions.assertThrows( IllegalArgumentException.class,
	                () -> account.withdraw(6000));
	    }
}
