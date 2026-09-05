package com.university.lab.helloworld.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount(100.0); // Start each test with 100.0 balance
    }

    @Test
    public void testDepositPositiveIncreasesBalance() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawValidDecreasesBalance() {
        account.withdraw(40.0);
        assertEquals(60.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawBeyondBalanceThrowsException() {
        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(150.0);
        });
    }

    @Test
    public void testDepositNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-20.0);
        });
    }
}