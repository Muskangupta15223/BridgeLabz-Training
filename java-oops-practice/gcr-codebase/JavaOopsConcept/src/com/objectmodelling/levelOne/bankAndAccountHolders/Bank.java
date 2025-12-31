package com.objectmodelling.levelOne.bankAndAccountHolders;

import java.util.List;
import java.util.ArrayList;

class Bank {
	
    private String bankName;
    private List<Customer> customers; // Bank has multiple customers

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Open a new account (add customer)
    public void openAccount(String customerName) {
        Customer customer = new Customer(customerName, this);
        customers.add(customer);
        System.out.println("Account opened for " + customerName + " in " + bankName);
    }

    // List all customers
    public void listCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer c : customers) {
            System.out.println("- " + c.getName());
        }
    }

    public String getBankName() {
        return bankName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
