package com.pluralight;

import java.util.Scanner;

public class FullNameAplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //attaching variables for each method to grab the name
        String first =fName(scanner);
        String middle =mName(scanner);
        String last = lName(scanner);
        String suffix = sName(scanner);

        //Creating a new variable that will gather the whole name
        String fullName = first;

        //If the there is a middle name it will add onto the fullname variable
        //if there isnt it will onlt be a space between first name and last name
        if(!middle.isEmpty()){
            fullName += " " + middle.charAt(0) + ".";
        }

        //adding last name to the fullname varaible
        fullName += " " + last;

        //if there is a suffix for the name it will attach to fullname with a "." after.
        //if there is no suffix it will be blank
        if(!suffix.isEmpty()){
            fullName += ", P" + suffix;
        }

        //Print out the full name for the User.
        System.out.println("\nFullname is: " + fullName);

    }
    //Method for the First Name
    public static String fName(Scanner scanner){
        System.out.println("What is your First Name?: ");
        return scanner.nextLine().trim();
    }
    //Method for the middle name
    public static String mName(Scanner scanner) {
        System.out.println("What is your Middle Name?: ");
        return scanner.nextLine().trim();
    }
    //Method for the last name
    public static String lName(Scanner scanner) {
        System.out.println("What is your Last Name?: ");
        return scanner.nextLine().trim();
    }
    //Method for the suffix
    public static String sName(Scanner scanner) {
        System.out.println("What is your Last Name?: ");
        return scanner.nextLine().trim();
    }
}
