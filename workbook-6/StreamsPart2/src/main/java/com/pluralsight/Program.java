package com.pluralsight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Creating a list of people
        List<Person> people = createPeopleList();

        // Taking user input for name search
        System.out.print("Enter a name to search: ");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();

        // Filtering people based on the entered name
        List<Person> matchingPeople = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(searchName) ||
                        person.getLastName().equalsIgnoreCase(searchName))
                .toList();

        // Displaying people with matching names
        System.out.println("People with matching name:");
        matchingPeople.forEach(person ->
                System.out.println(person.getFirstName() + " " + person.getLastName()));

        // Calculating and displaying the average age of all people
        double averageAge = calculateAverageAge(people);
        System.out.println("Average age: " + averageAge);

        // Finding and displaying the oldest person's age
        int oldestAge = findOldestAge(people);
        System.out.println("Oldest person's age: " + oldestAge);

        // Finding and displaying the youngest person's age
        int youngestAge = findYoungestAge(people);
        System.out.println("Youngest person's age: " + youngestAge);
    }

    // Method to create a list of people
    private static List<Person> createPeopleList() {
        List<Person> people = new ArrayList<>();
        // Add at least 10 people to the list
        people.add(new Person("John", "Doe", 25));
        // ... (add more people)
        return people;
    }

    // Method to calculate the average age of a list of people
    private static double calculateAverageAge(List<Person> people) {
        return people.stream()
                .mapToDouble(Person::getAge)
                .average()
                .orElse(0.0); // Default value if the stream is empty
    }

    // Method to find the oldest age in a list of people
    private static int findOldestAge(List<Person> people) {
        return people.stream()
                .map(Person::getAge)
                .max(Comparator.naturalOrder())
                .orElse(0); // Default value if the stream is empty
    }

    // Method to find the youngest age in a list of people
    private static int findYoungestAge(List<Person> people) {
        return people.stream()
                .map(Person::getAge)
                .min(Comparator.naturalOrder())
                .orElse(0); // Default value if the stream is empty