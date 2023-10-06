
package com.pluralsight;
import java.util.*;

    public class SandwichShop2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            //Declare Variables
            String regular;
            String Large;
            double price = 0;
            double finalPrice;
            double loadedPrice;

            //prompt User for what kind of sandwich they would like
            System.out.println("Would you like a Regular or Large Sandwich? ");
            String sandwich = input.nextLine();


            //If statement for a regular or large pricing
            if (sandwich.equals("Regular")) {
                price = 5.45;
            } else if (sandwich.equals("Large")) {
                price = 8.95;
            } else {
                System.out.println("Invalid Size");
                input.close();
            }

            //Prompt user to if they want a loaded sandwich
            System.out.println("Would you like a loaded sandwich? 1 = yes 0 = no");
            int input2 = input.nextInt();
            if(sandwich.equals("Regular") && input2 == 1){
                loadedPrice = price + 1.0;
            } else if (sandwich.equals("Large") && input2 == 1) {
                loadedPrice = price + 1.75;
            }else {
                loadedPrice = price + 0.0;
            }


            //Prompt user if they eligible for a discount
            System.out.println("How old are you? ");
            int age = input.nextInt();

            //Calculate discount
            if (age <= 17) {
                finalPrice = loadedPrice * .9;
            } else if (age >= 65) {
                finalPrice = loadedPrice * .8;
            } else {
                finalPrice = loadedPrice;
            }

            //Print the user price
            System.out.println("Your price for your sandwich is :$ " + finalPrice);
        }
    }
