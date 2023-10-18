package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StoreApp {

    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();

        Scanner scanner = new Scanner(System.in);

        //sort the list by Name
        //Collections.sort(inventory, Comparator.comparing(Product::getName));

        //For loop to print out the array list
//        for (int i = 0; i <inventory.size(); i++){
//            Product p = inventory.get(i);
//            System.out.printf("id: %d - Name: %s - Price: $%.2f\n",
//                    p.getId(), p.getName(), p.getPrice());


            // another way to print results
            //using the toString method
            //System.out.println(p);


        while(true){
            System.out.println(
                    "What do you want to do?\n" +
                    "1 - List all Products\n" +
                    "2 - Lookup a product by its id\n" +
                    "3 - Find all products within a price range\n" +
                    "4 - Add a new product\n" +
                    "5 - Quit the the application\n" +
                    "Enter Command: \n");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    listAllProducts(inventory);
                    break;
                case 2:
                    lookUpProductById(scanner, inventory);
                    break;
                case 3:
                    findProductByPriceRange(scanner, inventory);
                    break;
                case 4:
                    addNewProduct(scanner, inventory);
                    break;
                case 5:
                    System.out.println("Goodbye");
                    return;
            }
        }
    }

    public static void listAllProducts(ArrayList<Product> inventory){
        System.out.println("We carry the following inventory:");
        for (Product product: inventory){
            System.out.println(product);
        }
    }

    public static void findProductByPriceRange(Scanner scanner, ArrayList<Product> inventory ){
        System.out.println("Please eneter minumum price:");
        float minPrice = scanner.nextFloat();

        System.out.println("Please enter Maximum price:");
        float maxPrice = scanner.nextFloat();

        for(Product product: inventory){
            if(product.getPrice() >= minPrice && product.getPrice() <= maxPrice){
                System.out.println(product);
            }
        }
    }

    public static void lookUpProductById(Scanner scanner, ArrayList<Product> inventory ){
        System.out.println("Please enter Product ID:\n");
        int command = scanner.nextInt();

        for (Product product: inventory) {
           if(product.getId() == command){
               System.out.println(product);
               break;
           }else {
               System.out.println("Product not Found!");
           }
        }
    }
    public static ArrayList<Product> getInventory(){
        ArrayList<Product> inventory = new ArrayList<Product>();

        //this method loads product objects into inventory
        //and it details are not shown
        //Product product1 = new Product(1, "shirt", 19.99f);

//        //adding the product manually
//        inventory.add( new Product(1, "shirt", 19.99f));
//        inventory.add( new Product(2, "Pants", 29.99f));
//        inventory.add( new Product(3, "Shoes", 49.99f));
//        inventory.add( new Product(4, "Shampoo", 10.99f));
//        inventory.add( new Product(5, "Jacket", 69.99f));

        //Using a buffered reader to read an inventory file to get our products and print it out
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));
            String line;

            //using the while loop to read the file and break it up for the object
            while((line = bufferedReader.readLine()) != null){
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                float price = Float.parseFloat(tokens[2]);

                //create the object
                Product product = new Product(id, name, price);

                //add it to the array
                inventory.add(product);
            }
                bufferedReader.close();
        }catch(Exception ex){

        }
        return inventory;
    }

    public static void addNewProduct(Scanner scanner, ArrayList<Product> inventory ){
        System.out.println("Please enter the id: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Please enter the name of the product: ");
        String name = scanner.nextLine();

        System.out.println("Please enter the Price: ");
        float price = scanner.nextFloat();

        Product product = new Product(id, name, price);

        //Adding the new product to the array
        inventory.add(product);
    }
}
