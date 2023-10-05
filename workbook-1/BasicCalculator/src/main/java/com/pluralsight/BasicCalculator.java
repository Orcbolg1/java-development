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
        double input1 = scanner.nextDouble();

        //Grab second input
        System.out.println("Enter Second Number: ");
        double input2 = scanner.nextDouble();

        //Create options for customer to choose arithmetic
        System.out.println("Possible Calculations: \n"+
                "1. (A)dd\n"+
                "2. (S)ubtract\n"+
                "3. (M)ultiply\n"+
                "4. (D)ivide\n");

        //User will input an option for arithmetic
        System.out.println("Please select and option: ");
        String inputLetter = textScan.nextLine();

        //IF statement that put the first input and second input into an arithmetic
        if (inputLetter.equals(("M"))) {
            /*
            Performing Arithmetic
            Variable that multiplies 1st and 2nd input
            */
            double sum = input1 * input2;
            System.out.println(input1 + " * " + input2 + " = " + sum );
        } else if (inputLetter.equals(("A"))) {
            /*
            Performing Arithmetic
            Variable that add 1st and 2nd input
             */
            double sum = input1 + input2;
            System.out.println(input1 + " + " + input2 + " = " + sum);
        } else if (inputLetter.equals(("S"))) {
            /*
            Performing Arithmetic
            Variable that subtract 1st and 2nd input
             */
            double sum = input1 - input2;
            System.out.println(input1 + " - " + input2 + " = " + sum);
        }  else if (inputLetter.equals(("D"))) {
            /*
            Performing Arithmetic
            Variable that divide 1st and 2nd input
            */
            double sum = input1 / input2;
            System.out.println(input1 + " / " + input2 + " = " + sum);
        }
    }
}
