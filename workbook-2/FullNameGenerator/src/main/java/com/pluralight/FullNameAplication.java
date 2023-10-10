package com.pluralight;

import java.util.Scanner;

public class FullNameAplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String first =fName(scanner);
        String middle =mName(scanner);
        String last = lName(scanner);
        String suffix = sName(scanner);

        System.out.println("Your Full Name is " + first + " " + middle + " " + last + " " + " " + suffix);
    }

    public static String fName(Scanner scanner){
        System.out.println("What is your First Name?: ");
        return scanner.nextLine();
    }
    public static String mName(Scanner scanner) {
        System.out.println("What is your Middle Name?: ");
        return scanner.nextLine();
    }
    public static String lName(Scanner scanner) {
        System.out.println("What is your Last Name?: ");
        return scanner.nextLine();
    }
    public static String sName(Scanner scanner) {
        System.out.println("What is your Last Name?: ");
        return scanner.nextLine();
    }
}
