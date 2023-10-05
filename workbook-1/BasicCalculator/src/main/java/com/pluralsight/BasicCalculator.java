package com.pluralsight;
import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        //Greeting Message
        System.out.println("Welcome to Basic Calculator");

        //Create a Scanner
        Scanner scanner = new Scanner(System.in);
        Scanner textScan = new Scanner((System.in));

        // Grab First input
        System.out.println("Enter First Number: ");
        int input1 = scanner.nextInt();

        //Grab second input
        System.out.println("Enter Second Number: ");
        int input2 = scanner.nextInt();

        //Create options for customer to choose arithmetic
        System.out.println("Possible Calculations: \n"+
                "1. (A)dd\n"+
                "2. (S)ubtract\n"+
                "3. (M)ultiply\n"+
                "4. (D)ivide");

        //User will input an option for arithmetic
        System.out.println("Please select and option: ");
        String inputLetter = textScan.nextLine();

        //IF statement that put the first input and second input into a multiplication
        if (inputLetter.equals(("M"))) {
            //Performing Arithmetic
            //Variable that multiplies 1st and 2nd input
            int sum = input1 * input2;
            System.out.println(input1 + " * " + input2 + " = " + sum );

        }
    }
}
