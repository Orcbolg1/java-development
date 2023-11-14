package com.pluralsight;

public class CreditCard implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor to initialize the CreditCard object
    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    // Method to charge the credit card with a purchase amount
    public void charge(double amount) {
        // Check if the charge amount is valid
        if (amount > 0) {
            // Update the balance by deducting the charge amount
            balance -= amount;
            System.out.println("Charge of $" + amount + " successful. New balance: $" + balance);
        } else {
            // Display an error message for an invalid charge amount
            System.out.println("Invalid charge amount. Amount must be greater than 0.");
        }
    }

    // Method to make a payment towards the credit card balance
    public void pay(double amount) {
        // Check if the payment amount is valid
        if (amount > 0) {
            // Update the balance by adding the payment amount
            balance += amount;
            System.out.println("Payment of $" + amount + " successful. New balance: $" + balance);
        } else {
            // Display an error message for an invalid payment amount
            System.out.println("Invalid payment amount. Amount must be greater than 0.");
        }
    }

    // Implementation of the getValue() method from the Valuable interface
    @Override
    public double getValue() {
        return -balance;
    }
}
