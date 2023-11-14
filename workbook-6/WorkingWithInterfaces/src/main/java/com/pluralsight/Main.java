package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<>();
        myFamily.add(new Person("Dana", "Wyatt", 63));
        myFamily.add(new Person("Zachary", "Westley", 31));
        myFamily.add(new Person("Elisha", "Aslan", 15));
        myFamily.add(new Person("Ian", "Auston", 16));
        myFamily.add(new Person("Zephaniah", "Hughes", 9));
        myFamily.add(new Person("Erza", "Aiden", 17));

        // Compare by First Name
        Collections.sort(myFamily);

        for (Person person : myFamily) {
            System.out.println(person);
        }
        System.out.println("========================================");



    }
}
