package com.pluralight;

import java.util.Scanner;

public class FullNameAplication {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String first =fName(scanner);
        String middle =mName(scanner);
        String last = lName(scanner);
        String suffix = sName(scanner);


        String fullName = first;
        if(!middle.isEmpty()){
            fullName += " " + middle.charAt(0) + ".";
        }

        fullName += " " + last;

        if(!suffix.isEmpty()){
            fullName += ", P" + suffix;
        }

        System.out.println("\nFullname is: " + fullName);

    }

    public static String fName(Scanner scanner){
        System.out.println("What is your First Name?: ");
        return scanner.nextLine().trim();
    }
    public static String mName(Scanner scanner) {
        System.out.println("What is your Middle Name?: ");
        return scanner.nextLine().trim();
    }
    public static String lName(Scanner scanner) {
        System.out.println("What is your Last Name?: ");
        return scanner.nextLine().trim();
    }
    public static String sName(Scanner scanner) {
        System.out.println("What is your Last Name?: ");
        return scanner.nextLine().trim();
    }
}
