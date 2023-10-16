package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String [] quotes = {

        };

        Random random = new Random();

        while(true){
            try {
                System.out.println("Weclome\n" +
                        "Select 1 to 10 hear a qoutes\n" +
                        "Select R for a random qoute\n " +
                        "Your choice is: ");

                String input = scanner.next();
                if(input.equalsIgnoreCase("R")){
                    int
                }

            }catch (Exception e){
                System.out.println("something is wrong");
            }
        }
    }
}
