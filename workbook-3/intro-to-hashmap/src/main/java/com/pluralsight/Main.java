package com.pluralsight;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> statesAndCapitals = new HashMap<String, String>();

        statesAndCapitals.put("CT", "Hartford");
        statesAndCapitals.put("CA", "Sacramento");
        statesAndCapitals.put("WA", "Olympia");
        statesAndCapitals.put("TX", "Austin");
        statesAndCapitals.put("FL", "Tallahassee");

//        System.out.println(statesAndCapitals);
//
//        //Grab a specific part in the map, its case sensitive and you must use the key identifier,
//        //cant use capital to find states, must use state to find capital
//        System.out.println(statesAndCapitals.get("Austin"));
//
//        String value = statesAndCapitals.get("TX");
//        if (value != null){
//            System.out.println(value);
//        }else{
//            System.out.println("This key is not valid.");
//        }
//
//        statesAndCapitals.remove("CA");
//        System.out.println(statesAndCapitals);
//
//        statesAndCapitals.clear();
//        System.out.println(statesAndCapitals);

        //print out all the values (capitals) into an array using .values()
        //doesnt print out the keys (states)
        for(String value:statesAndCapitals.values()) {
            System.out.println(value);
        }
        System.out.println("=================================");

        //print out all the keys (states) into an array using .keyset()
        //doesn't print out the value (capitals)
        for (String value1:statesAndCapitals.keySet()
             ) {
            System.out.println(value1);
        }
    }
}
