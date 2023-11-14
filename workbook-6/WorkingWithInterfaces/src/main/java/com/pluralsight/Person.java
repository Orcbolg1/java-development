package com.pluralsight;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        // Compare persons based on their last names
        int lastNameComparison = this.lastName.compareTo(otherPerson.lastName);

        // If last names are equal, compare based on first names
        if (lastNameComparison == 0) {
            return this.firstName.compareTo(otherPerson.firstName);
        }

        // If last names and first names are equal, compare based on age
        if (lastNameComparison == 0 && this.firstName.equals(otherPerson.firstName)) {
            return Integer.compare(this.age, otherPerson.age);
        }

        return lastNameComparison;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
