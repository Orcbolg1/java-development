package com.pluralsight;
import java.util.*;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //Declare Variables
        String regular;
        String Large;
        double price = 0;
        double price1;

        //prompt User for what kind of sandwich they would like
        System.out.println("Would you like a Regular or Large Sandwich? ");
        String sandwich = input.nextLine();


        //If statement for a regular or large pricing
        if(sandwich.equals("Regular")){
            price = 5.45;
        } else if(sandwich.equals("Large")){
            price = 8.95;
        }else{
            System.out.println("Invalid Size");
            input.close();
        }

        //Prompt user if they eligible for a discount
        System.out.println("How old are you? ");
        int age = input.nextInt();

        //Calculate discount
        if (age <= 17){
            price1 = price * .9;
        } else if(age >= 65){
            price1 = price *.8;
        }else{
            price1 = price;
        }

        //Print the user price
        System.out.println("Your price for your sandwich is :$ " + price1);
    }
}
