package com.pluralsight;
import java.util.*;


public class MyApplication {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        // Method grab user's name
        String name = getName(scanner);

        // Method grab user's age
        int age = getAge(scanner);

        //Method that return a message for the user on their inputs
        personalizedMessage(name, age);

        //Method that print if user is old enough to vote
        votingEligbility(age);

        //Method that gives a personalized message for ALice
        printWelcomeMessage(name);

        //Method that checks to see if bob is old enough to drink
        drinkingEligibility(name, age);

        //Print out the square root of a number
        squareRoot(scanner);

        // New welcome message using switch
        printWelcomeMessage1(name);

        //
        int firstNumber = getFirstNumber(scanner);
        int secondNumber = getSecondNumber(scanner);

        isGreaterThan(firstNumber, secondNumber);

        }

    private static int getSecondNumber(Scanner scanner) {
        System.out.println("Enter a second Number: ");
        return scanner.nextInt();
    }

    private static int getFirstNumber(Scanner scanner) {
        System.out.println("Enter a first Number: ");
        return scanner.nextInt();
    }


    public static boolean isGreaterThan(int firstNumber, int secondNumber){
        return firstNumber > secondNumber;
        }

    public static void printWelcomeMessage(String name){
        if(name.equalsIgnoreCase("Alice")){
            System.out.println("Welcome Alice!");
        }else{
            System.out.println("Welcome " + name +"!");
        }
    }
    public static String getName(Scanner scanner){
        //Prompt user for their name
        System.out.println("Enter Your Name: ");
        return scanner.nextLine();
    }

    public static int getAge(Scanner scanner){
        //prompt user their age
        System.out.println("Enter your age: ");
        return scanner.nextInt();
    }

    private static void personalizedMessage(String name, int age) {
        // Personalized message that show user's name and age
        System.out.println("Hello " + name + "! You are " + age + " year old.");
        }


    public static void votingEligbility(int age){
        if(age >= 18){
            System.out.println("You are old enough to vote!");
        }else{
            System.out.println("You are not old enough to vote!");
    }
        

    }

    public static void drinkingEligibility(String name, int age){
        if (name.equalsIgnoreCase("Bob") && age >= 21){
            System.out.println("You are old enough to drink");
        }else if (age >= 21){
            System.out.println("You are old enough to drink");
        }else {
            System.out.println("You are not old enough to drink");
        }
    }

    public static double squareRoot(Scanner scanner){
        System.out.println("Enter a number to square root: ");
        double roots = scanner.nextDouble();
        double square = Math.sqrt(roots);
        System.out.println("The square root of " + roots + " is " + square);
        return square;
    }

    public static void printWelcomeMessage1(String name){
        switch (name.toLowerCase()){
            case "alice":
                System.out.println("Welcome Alice");
                break;
            case "bob":
                System.out.println("Would you like to grab a drink? ");
                break;
            default:
                System.out.println("Hello " + name);
                break;

        }
    }
}

