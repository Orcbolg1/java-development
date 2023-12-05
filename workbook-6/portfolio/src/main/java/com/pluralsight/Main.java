package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio("My Portfolio", "John Doe");
        Scanner scanner = new Scanner(System.in);

        int input;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a new Bank Account");
            System.out.println("2. Add a new Credit Card");
            System.out.println("3. Add new Jewelry");
            System.out.println("4. View Portfolio Details");
            System.out.println("0. Exit");
            System.out.print("Enter your input: ");

            input = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (input) {
                case 1:

                    break;
                case 2:
                    addCreditCard(portfolio, scanner);
                    break;
                case 3:
                    addJewelry(portfolio, scanner);
                    break;
                case 4:
                    displayPortfolioDetails(portfolio);
                    break;
                case 0:
                    System.out.println("Exiting. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        } while (input != 0);

        scanner.close();
    }
}
