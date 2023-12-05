package com.pluralsight;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Create a list to store people
        List<Person> people = new ArrayList<>();

        // Add 10 people to the list
        people.add(new Person("John", "Doe", 30));
        people.add(new Person("Jane", "Smith", 25));
        people.add(new Person("Michael", "Johnson", 40));
        people.add(new Person("Emily", "Davis", 22));
        people.add(new Person("Robert", "Williams", 35));
        people.add(new Person("Sophia", "Jones", 28));
        people.add(new Person("Daniel", "Brown", 32));
        people.add(new Person("Olivia", "Miller", 27));
        people.add(new Person("Matthew", "Anderson", 38));
        people.add(new Person("Ava", "Taylor", 26));

        // Calculate the average age
        double totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        double averageAge = totalAge / people.size();

        // Display the average age
        System.out.println("Average Age: " + averageAge);

        // Find the age of the oldest person
        int maxAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
        }

        // Display the age of the oldest person
        System.out.println("Age of the Oldest Person: " + maxAge);

        // Find the age of the youngest person
        int minAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() < minAge) {
                minAge = person.getAge();
            }
        }

        // Display the age of the youngest person
        System.out.println("Age of the Youngest Person: " + minAge);

        // Prompt the user for a name to search for
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name (first or last name) to search for: ");
        String searchName = scanner.nextLine();

        // Create a new list of people whose name matches the input
        List<Person> matchingPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getfName().equalsIgnoreCase(searchName) || person.getlName().equalsIgnoreCase(searchName)) {
                matchingPeople.add(person);
            }
        }

        // Display the names of the people in the matching list
        if (matchingPeople.isEmpty()) {
            System.out.println("No matching names found.");
        } else {
            System.out.println("Matching names:");
            for (Person person : matchingPeople) {
                System.out.println(person.getfName() + " " + person.getlName());
            }
        }
    }
}
