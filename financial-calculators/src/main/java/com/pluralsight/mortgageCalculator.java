package com.pluralsight;
import java.util.*;
import java.text.NumberFormat;


public class mortgageCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        welcomeMessage();
        mortgage();

    }

    public static void welcomeMessage() {
        System.out.println("Welcome to the Mortgage Calculator " +
                "\nHow can I help you?");
    }

    public static void mortgage() {
        //Declare variables that are constants
        final byte monthsInYear = 12;
        final byte percent = 100;

        //prompt user to input the principal
        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        if(principal <= 0){
            System.out.println("Your no longer have a payment");
        }

        //prompt user to input the annual interest rate
        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / percent / monthsInYear;

        //prompt user how many payment user have to pay in his mortgage
        System.out.println("How many years is your Mortgage: ");
        byte years = scanner.nextByte();
        int numberOfPayment = years * monthsInYear;

        //calculation for the user
        double mortgages = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment)
        /(Math.pow(1 + monthlyInterest, numberOfPayment) - 1));

        //Return the user their monthly payment for their mortgage
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgages);
        System.out.println("Your Monthly Mortgages is: " + mortgageFormatted);

        // Return the amount of interest you accrue while paying off the mortgage
        double totalInterests = (mortgages * numberOfPayment) - principal;
        String interestsFormatted = NumberFormat.getCurrencyInstance().format(totalInterests);
        System.out.println("Your Interests paid is: " + interestsFormatted);
    }


}


