package com.pluralsight;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println(
                        "Application needs two arguments to run: " +
                                "java com.hca.jdbc.UsingDriverManager <username> <password>");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    username,
                    password);

            while (true) {
                System.out.println("Main Menu:");
                System.out.print("1. Display all Products");
                System.out.print("2. Display all Customers");
                System.out.print("Exit");
                System.out.print("Select an option: ");


                java.util.Scanner scanner = new java.util.Scanner(System.in);
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        displayAllProducts(connection);
                        break;
                    case 2:
                        displayAllCustomers(connection);
                        connection.close();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("error");
                }
            }
        }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
        if(resultSet != null) resultSet.close();
        if(preparedStatement != null) preparedStatement.close();
        if(connection != null) connection.close();
    }

    private static void displayAllProducts(Connection connection) throws SQLException {
        String query = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet results = statement.executeQuery();

        while (results.next()) {
            int productId = results.getInt("ProductID");
            String productName = results.getString("ProductName");
            double unitPrice = results.getDouble("UnitPrice");
            int unitsInStock = results.getInt("UnitsInStock");

            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Unit Price: " + unitPrice);
            System.out.println("Units In Stock: " + unitsInStock);
            System.out.println("-----------------------------------------");
        }

        // Close the ResultSet and PreparedStatement
        results.close();
        statement.close();
    }

    private static void displayAllCustomers(Connection connection) throws SQLException {
        String query = "SELECT CustomerID, CompanyName, ContactName, ContactTitle FROM customers";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet results = statement.executeQuery();

        while (results.next()) {
            String customerId = results.getString("CustomerID");
            String companyName = results.getString("CompanyName");
            String contactName = results.getString("ContactName");
            String contactTitle = results.getString("ContactTitle");

            System.out.println("Customer ID: " + customerId);
            System.out.println("Company Name: " + companyName);
            System.out.println("Contact Name: " + contactName);
            System.out.println("Contact Title: " + contactTitle);
            System.out.println("-----------------------------------------");
        }

        // Close the ResultSet and PreparedStatement
        results.close();
        statement.close();
    }
}

