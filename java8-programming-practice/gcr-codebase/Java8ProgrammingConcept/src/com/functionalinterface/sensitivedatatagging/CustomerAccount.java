package com.functionalinterface.sensitivedatatagging;

public class CustomerAccount implements SensitiveData {

		private String accountNumber;

	public CustomerAccount(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
}
