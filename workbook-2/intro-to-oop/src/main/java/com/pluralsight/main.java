package com.pluralsight;

import java.util.Scanner;

public class main {

    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
    car newcar = new car("Red", 2000,
            "Mercedes", "c3000",
            2000.00);

    car oldcar = new car("Black", 1840,
            "Honda", "Accord",
            3000.0);


        System.out.println(newcar.getColor());

        //Using a setter to change the color the new car.
        newcar.setColor("Blue");

        System.out.println(newcar.getColor());


        System.out.println("Please enter the title of the book: ");
        String titleFrom = scanner.nextLine();

        System.out.println("Please enter number of pages: ");
        int numberOfPagesFrom = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the Author of the book: ");
        String authorFrom = scanner.nextLine();

        System.out.println("Please enter the Year of the book: ");
        int yearFrom = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the Type of the book: ");
        String typeFrom = scanner.nextLine();

        System.out.println("Please enter the Genre of the book: ");
        String genreFrom = scanner.nextLine();

        System.out.println("Please enter the Price  = of the book: ");
        double priceFrom = scanner.nextDouble();

        Book newBook = new Book(titleFrom, numberOfPagesFrom, authorFrom, yearFrom,
                typeFrom, genreFrom, priceFrom);

        System.out.println("The title of this book is: " + newBook.getTitle());


        oldcar.accelerate(10);
        oldcar.accelerate(10);
        System.out.println(oldcar.getSpeed());

        oldcar.brake(30);
        System.out.println(oldcar.getSpeed());

        oldcar.accelerate(); // += 15
        System.out.println(oldcar.getSpeed());

        oldcar.accelerate();
        System.out.println(oldcar.getSpeed());

    }
}
