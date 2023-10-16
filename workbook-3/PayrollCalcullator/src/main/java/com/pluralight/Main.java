package com.pluralight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FilterReader;

public class Main {

    public static void main(String[] args) {
        String fileName = "employees.csv";

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;

            while((line = bufferedReader.readLine()) != null){
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employees employee = new Employees(id, name, hoursWorked, payRate);

                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n", employee.getEmployeeID()
                ,employee.getName(), employee.getGrossPay());
            }


        }catch(Exception ex){
            
        }
    }
}
