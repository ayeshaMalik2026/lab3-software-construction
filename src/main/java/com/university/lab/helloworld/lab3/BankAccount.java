package com.university.lab.helloworld.lab3;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amt) {
        if (amt < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt > balance) {
            throw new IllegalStateException("Insufficient funds.");
        }
        if (amt < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        balance -= amt;
    }

    public double getBalance() {
        return balance;
    }
}