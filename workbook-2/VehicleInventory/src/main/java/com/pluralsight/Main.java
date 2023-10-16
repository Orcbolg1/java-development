package com.pluralsight;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Creating an array with our Vehicle object
        Vehicle[] vehicles = new Vehicle[20];

        //How many vehicles we have
        //Set up a counter
        int numVehicles = 6;

        //6 vehicles inside the array
        vehicles[0] = new Vehicle(101121, "Ford Explorer",
                "Red", 45000, 13500f);
        vehicles[1] = new Vehicle(101122, "Toyota Camry",
                "Blue", 60000, 11000f);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu",
                "Black", 50000, 9700f);
        vehicles[3] = new Vehicle(101124, "Honda Civic",
                "White", 70000, 7500f);
        vehicles[4] = new Vehicle(101125, "Subaru Outback",
                "Green", 55000, 4500f);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler",
                "Yellow", 30000, 16000f);

        //Menu that will return until you choose case 6
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.println("Enter your command: ");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    listAllVehicles(vehicles, numVehicles);
                    break;
                case 2:
                    findVehicleByMakeModel(vehicles, numVehicles, scanner);
                    break;
                case 3:
                    //findVehiclesByPrice();
                    break;
                case 4:
                findVehicleByColor(vehicles, numVehicles, scanner);
                case 5:
                    //addAVehicle();
                    break;
                case 6:
                    System.out.println("Goodbye");
                    return;
            }
        }
    }


    //Method for case 1
    public static void listAllVehicles(Vehicle[] vehicles, int numVehicles){
        System.out.println("Vehicle Inventory:");

        for (int i = 0; i < numVehicles; i++) {
            System.out.println(vehicles[i]);

        }
    }

    public static void findVehicleByMakeModel(Vehicle[] vehicles, int numVehicles, Scanner scanner){

        System.out.println("Enter the Make and Model");
        String makeModel = scanner.nextLine();
        scanner.nextLine();
        for(int i = 0; i < numVehicles; i++){
            if(vehicles[i].getMakeOfModel().equals(makeModel)){
                System.out.println(vehicles[i]);
            }
        }
    }
    public static void findVehicleByColor(Vehicle[] vehicles, int numVehicles, Scanner scanner){

        System.out.println("Enter the Color");
        String color = scanner.nextLine();
        scanner.nextLine();
        for(int i = 0; i < numVehicles; i++){
            if(vehicles[i].getColor().equals(color)){
                System.out.println(vehicles[i]);
            }
        }
    }




}