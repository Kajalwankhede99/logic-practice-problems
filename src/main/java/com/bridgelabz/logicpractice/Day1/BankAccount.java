package com.bridgelabz.logicpractice.Day1;

public class BankAccount {
    private double balance;
    private int accountNumber;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance =balance + amount;
            System.out.println("Amount Deposited: $" + amount);
        } else {
            System.out.println("Invalid");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance =balance - amount;
            System.out.println("Amount Withdraw: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid Amount.");
        }
    }

    public void printAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, 1000.00);
        account.printAccountDetails();
        account.deposit(500.00);
        account.withdraw(200.00);
        account.printAccountDetails();
    }
}
