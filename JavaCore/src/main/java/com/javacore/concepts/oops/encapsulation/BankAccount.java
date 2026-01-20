package com.javacore.concepts.oops.encapsulation;

public class BankAccount {
    //restricting direct access to fields
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        setBalance(initialBalance); //using setter for initial validation
    }

    //defining getters and setters to force outside classes to use these methods only
    //to access and modify the fields, no direct access allowed

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) { //simple validation
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
}
