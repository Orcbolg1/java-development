package com.pluralsight;
import java.text.NumberFormat;
import java.util.Scanner;

public class cdCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        cd();
    }
    public static void cd(){
        //Greetings
        System.out.println("Welcome to CD calculator");

        //Prompt user to enter their initial deposit
        System.out.println("Enter the initial deposit amount: ");
        double deposit = scanner.nextDouble();
        if (deposit < 0.0) {
            System.out.println("Error: Incorrect Deposit!");
        }

        //Prompt user to enter their interest rate
        System.out.println("Enter your interest rate: ");
        double interestRate = scanner.nextDouble();
        interestRate /= 1200;

        //Prompt user how long their CD. Made a new variable that change the years -
        //to number of months
        System.out.println("How many years is your CD");
        int years = scanner.nextInt();
        int numOfMonths = years * 12;

        //The calculations to get the total amount of interest accrued plus the deposit
        double futureValue = Math.pow((1 + interestRate), numOfMonths);
        futureValue = deposit * futureValue;
        String futureValueFormatted = NumberFormat.getCurrencyInstance().format(futureValue);
        System.out.println("Your Total Amount is: " + futureValueFormatted);

        //display the amount you have interest have accrued
        double totalinterests = futureValue - deposit;
        System.out.println("your interests is : $" + String.format("%.2f", totalinterests));

    }

}
