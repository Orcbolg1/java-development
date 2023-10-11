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

        cellPhoneApplication newPhone1 = new cellPhoneApplication()
        //Create a new
        cellPhoneApplication newCarrier = new cellPhoneApplication(serialNumberFrom,modelFrom,
                carrierFrom, phoneNumberFrom, ownerFrom);
        newCarrier.setSerialnumber((serialNumberFrom));
        newCarrier.setModel(modelFrom);
        newCarrier.setCarrier(carrierFrom);
        newCarrier.setPhoneNumber(phoneNumberFrom);
        newCarrier.setOwner(ownerFrom);


        //Print out the results
        System.out.println("Your Serial Number is: " + newCarrier.getSerialnumber());
        System.out.println("Your Model is: " + newCarrier.getModel());
        System.out.println("Your Carrier is: " + newCarrier.getCarrier());
        System.out.println("Your Phone Number is: " + newCarrier.getPhoneNumber());
        System.out.println("Your Owner is: " + newCarrier.getOwner());
        }


    }

