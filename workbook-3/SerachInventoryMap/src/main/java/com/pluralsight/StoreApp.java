package com.pluralsight;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {

    private static HashMap<Integer, Product> inventory = new HashMap<>();

    public static void main(String[] args) {

        loadInventory();

        boolean repeat = true;

        while (repeat) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What item # are you interested in? ");
            int id = scanner.nextInt();
            Product matchedProduct = inventory.get(id);
            if (matchedProduct == null) {
                System.out.println("We don't carry that product");
                return;
            }
            System.out.printf("We carry %s and the price is $%.2f\n", matchedProduct.getName(), matchedProduct.getPrice());

            //Buffer
            scanner.nextLine();

            System.out.println("Would you like to continue? Y or N");
            String prompt = scanner.nextLine();

            //faster way to get to repeat the loop while using a boolean
            repeat = prompt.equalsIgnoreCase("y");

            //original loop to repeat the loop
            //problem is the code is long and has redundant code.
//            if (prompt.equalsIgnoreCase("n")){
//                repeat = false;
//                System.out.println("Goodbye");
//            }else {
//                repeat = true;
//            }

        }
    }


    public static void loadInventory(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));

            String input;

            while((input = bufferedReader.readLine()) != null){
                String[] tokens = input.split("\\|");
                int id = Integer.parseInt((tokens[0]));
                String name = tokens[1];
                float price = Float.parseFloat(tokens[2]);

                Product product = new Product(id, name, price);
                inventory.put(id, product);
            }
        }catch (Exception ex){

        }
    }
}
