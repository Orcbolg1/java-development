package com.pluralsight;

public class Mathapp {

    public static void main(String[] args) {

        //Question 1 Seeing between the two who have the highest salary
        // Declaring the variables.
        double bobSalary = 45000;
        double garySalary = 62300;
        double highestSalary = Math.max(bobSalary, garySalary);

        //Display who has the highest salary
        System.out.println("1. The highest salary is $" + highestSalary);

        //Question 2. Smallest price
        //Declaring Variables
        double carprice = 22999.9;
        double truckprice = 45299.9;
        double smallestprice = Math.min(carprice, truckprice);

        //Display which of the two vehicles is the lowest price
        System.out.println("2. The lowest price is $" +smallestprice);

        //Question 3. Area of a circle
        //Declaring Variables
        //Using Math.PI
        double radius = 7.25; //radius value
        double area = (Math.PI * Math.pow(radius, 2));

        //Display the area of the circle
        System.out.println("3. The area of the circle is: " + area);

        //Question 4 Square root of a variable
        //Declare Variables
        double a = 5; // variable was given

        // Display results
        System.out.println("4. Sqaure root of " + a + " is: " + Math.sqrt(a));

        //Question 5 Find the distance between two points
        //Declare Variables
        double x1 = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        //Display
        System.out.println("5. The distance between the two points are: " + distance);

        //Question 6 change a negative to a positive
        //Declare variables
        double b = -3.8;

        //display
        System.out.println("6. Positive: " + Math.abs(b));

        //7. Random number between 0 - 1
        //declare variables
        double random_int = Math.random();
        System.out.println("7. Random Number between 0 to 1 is: " + random_int);
    }
}
