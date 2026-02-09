package com.multithreading.bankTransactions;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Bank {
    private final Map<Integer, Account> accounts = new ConcurrentHashMap<>();

    public void addAccount(int accountNumber, int initialBalance) {
        accounts.put(accountNumber, new Account(initialBalance));
    }

    public void deposit(int accountNumber, int amount) {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account not found: " + accountNumber);
        }
        synchronized (account) {
            account.deposit(amount);
        }
    }

    public void withdraw(int accountNumber, int amount) {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account not found: " + accountNumber);
        }
        synchronized (account) {
            if (!account.withdraw(amount)) {
                throw new IllegalStateException("Insufficient funds for account: " + accountNumber);
            }
        }
    }

    public int getBalance(int accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account not found: " + accountNumber);
        }
        synchronized (account) {
            return account.getBalance();
        }
    }
}