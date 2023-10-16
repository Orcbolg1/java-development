package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        FileInputStream fis; //create necessary variables
        Scanner scanner = new Scanner(System.in);
        int input;
        String storyPath = "";

        System.out.println("Choose the story options are:"); //prompt user
        System.out.println("1. Goldilocks");
        System.out.println("2. Hansel & Gretel");
        System.out.println("3. Mary Had a Little Lamb");
        System.out.print("Please pick the one you would like to have read: ");
        input = scanner.nextInt();

        switch (input){ //check user choice
            case 1:
                storyPath = "goldilocks.txt";
                break;
            case 2:
                storyPath = "hansel_and_gretel.txt";
                break;
            case 3:
                storyPath = "mary_had_a_little_lamb.txt";
                break;
        }
        try{ //attempt to display chosen story
            fis = new FileInputStream(storyPath);
            scanner.close(); //change input source for scanner object
            scanner = new Scanner(fis);
            while (scanner.hasNextLine()){
                String input1 = scanner.nextLine();
                System.out.println(input1);
            }
        }
        catch (Exception e){ //throw error if story cannot be read
            System.out.println("ERROR: Story could not be initialized");
        }
    }
}

