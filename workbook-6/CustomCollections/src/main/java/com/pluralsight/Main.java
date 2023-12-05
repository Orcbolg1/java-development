package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(34);

        System.out.println(numbers.getItems().size());



    }
}
