package com.pluralsight;

import java.util.Scanner;

public class PresentValue {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

       annuityCalculator();


    }

    public static void annuityCalculator(){

        //Greet the User and get the monthly deposit
        System.out.println("Welcome to your annuity calculator! ");
        System.out.println("What is your monthly deposit for your annuity: $");
        double monthlyDeposit = scanner.nextDouble();
        if(monthlyDeposit < 0.0){
            System.out.println("Error Incorrect Value! Please Try Again!");
        }

        //prompt user to get the interest rate
        System.out.println("What is your annual interest rate: ");
        double annualInterest = scanner.nextDouble();
        if(annualInterest < 0.0){
            System.out.println("Incorrect Value! Please Try Again!");
        }

        //convert interest from a percentage to a decimal
        double annualInterestPercentage = annualInterest / 1200;

        //prompt user the years in their terms
        System.out.println("How many years are in your term: ");
        int years = scanner.nextInt();
        if(years < 0){
            System.out.println("Incorrect Value! Please Try Again!");
        }

        //perform calculations
        double temp = 1 - Math.pow(1 + annualInterestPercentage, -years * 12);
        double finalAnnuity = monthlyDeposit * (temp/annualInterestPercentage);

        //print out the result
        System.out.println("Your present value is $" + String.format("%.2f", finalAnnuity));

    }


}
