package com.pluralsight;

public class BankAccount implements Valuable{

    // Instance variables
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor to initialize the BankAccount object
    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    // Method to deposit money into the account
    public void deposit(double amount) {
        // Check if the deposit amount is valid
        if (amount > 0) {
            // Update the balance and display a success message
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
        } else {
            // Display an error message for invalid deposit amount
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        // Check if the withdrawal amount is valid and within the available balance
        if (amount > 0 && amount <= balance) {
            // Update the balance and display a success message
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            // Display an error message for invalid withdrawal amount
            System.out.println("Invalid withdrawal amount. Amount must be greater than 0 and less than or equal to the balance.");
        }
    }

    // Implementation of the getValue() method from the Valuable interface
    @Override
    public double getValue() {
        return balance;
    }
}
