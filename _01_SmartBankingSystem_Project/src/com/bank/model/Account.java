package com.bank.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;
    private int pin;
    private List<Transaction> transactions = new ArrayList<>();

    public Account(int accountNumber, String name, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        transactions.add(new Transaction("Account Opened", balance, balance));
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount, balance));
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction("Withdraw", amount, balance));
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
