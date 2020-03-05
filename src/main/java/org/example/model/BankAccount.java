package org.example.model;

import java.util.UUID;

public class BankAccount {
    private double balance;
    private UUID id;

    public BankAccount() {
        id = UUID.randomUUID();
        balance = 0;
    }

    public boolean deposit(double amount)
    {
        if (amount <= 0)
        {
            return false;
        }

        balance += amount;

        return true;
    }

    public boolean withdraw(double amount)
    {
        if (balance < 0 && balance < amount)
        {
            return false;
        }

        balance -= amount;

        return true;
    }

    public double getBalance() {
        return balance;
    }

    public UUID getId() {
        return id;
    }
}
