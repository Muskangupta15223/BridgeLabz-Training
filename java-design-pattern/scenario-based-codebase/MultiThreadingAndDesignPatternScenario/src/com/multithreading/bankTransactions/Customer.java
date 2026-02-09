package com.multithreading.bankTransactions;

public class Customer extends Thread {
    public enum Type {
        DEPOSIT,
        WITHDRAW
    }

    private final int customerId;
    private final Bank bank;
    private final int accountNumber;
    private final Type[] types;
    private final int[] amounts;

    public Customer(int customerId, Bank bank, int accountNumber, Type[] types, int[] amounts) {
        this.customerId = customerId;
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.types = types;
        this.amounts = amounts;
    }

    @Override
    public void run() {
        for (int i = 0; i < types.length; i++) {
            Type type = types[i];
            int amount = amounts[i];
            try {
                if (type == Type.DEPOSIT) {
                    bank.deposit(accountNumber, amount);
                    System.out.println("Customer " + customerId + " deposited " + amount);
                } else {
                    bank.withdraw(accountNumber, amount);
                    System.out.println("Customer " + customerId + " withdrew " + amount);
                }
            } catch (RuntimeException e) {
                System.out.println("Customer " + customerId + " failed: " + e.getMessage());
            }
        }
    }
}
