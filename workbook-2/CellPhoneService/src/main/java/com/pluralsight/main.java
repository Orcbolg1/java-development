package com.pluralsight;

import java.util.Scanner;

public class main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Prompt user for Data
        System.out.println("What is your Serial Number: ");
        long serialNumberFrom = scanner.nextLong();
        scanner.nextLine();

        System.out.println("What is your Cell Phone Model: ");
        String modelFrom = scanner.nextLine();

        System.out.println("Who is your Carrier From: ");
        String carrierFrom = scanner.nextLine();

        System.out.println("What is your Phone Number: ");
        String phoneNumberFrom = scanner.nextLine();

        System.out.println("What is the Owner name?: ");
        String ownerFrom = scanner.nextLine();


        //Create a new
        cellPhoneApplication newCarrier1 = new cellPhoneApplication(
        );
        newCarrier1.setSerialnumber((serialNumberFrom));
        newCarrier1.setModel(modelFrom);
        newCarrier1.setCarrier(carrierFrom);
        newCarrier1.setPhoneNumber(phoneNumberFrom);
        newCarrier1.setOwner(ownerFrom);


        //Prompt user for Data
        System.out.println("What is your Serial Number: ");
        long serialNumberFrom1 = scanner.nextLong();
        scanner.nextLine();

        System.out.println("What is your Cell Phone Model: ");
        String modelFrom1 = scanner.nextLine();

        System.out.println("Who is your Carrier From: ");
        String carrierFrom1 = scanner.nextLine();

        System.out.println("What is your Phone Number: ");
        String phoneNumberFrom1 = scanner.nextLine();

        System.out.println("What is the Owner name?: ");
        String ownerFrom1 = scanner.nextLine();

        cellPhoneApplication newCarrier2 = new cellPhoneApplication(
        );
        newCarrier2.setSerialnumber((serialNumberFrom1));
        newCarrier2.setModel(modelFrom1);
        newCarrier2.setCarrier(carrierFrom1);
        newCarrier2.setPhoneNumber(phoneNumberFrom1);
        newCarrier2.setOwner(ownerFrom1);


        //Print out the results
        display(newCarrier1);
        display(newCarrier2);

        newCarrier1.dial(newCarrier2.getPhoneNumber());
        newCarrier2.dial(newCarrier1.getPhoneNumber());


        //overloaded constructor accepting input
        cellPhoneApplication newCarrier3 = new cellPhoneApplication(123456, "iphone",
                "x",
                "111-555-3434",
                "Mary");
        display(newCarrier3);
        newCarrier1.dial(newCarrier3);




        }
        public static void display(cellPhoneApplication newCarrier){
            System.out.println("Your Serial Number is: " + newCarrier.getSerialnumber());
            System.out.println("Your Model is: " + newCarrier.getModel());
            System.out.println("Your Carrier is: " + newCarrier.getCarrier());
            System.out.println("Your Phone Number is: " + newCarrier.getPhoneNumber());
            System.out.println("Your Owner is: " + newCarrier.getOwner());
        }


    }

