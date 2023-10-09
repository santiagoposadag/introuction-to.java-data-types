package com.sofka.custom.object;

import java.util.ArrayList;

public class ArrayExample {
    public static void main(String[] args) {
        // Using String[] (array of strings)
        String[] fruitsArray = {"Apple", "Banana", "Cherry"};
        String[] fruitsArrayTwo = new String[3];
        fruitsArrayTwo[0] = "Apple2";
        fruitsArrayTwo[1] = "Banana2";
        fruitsArrayTwo[2] = "Cherry2";


        // Using ArrayList<String>
        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Cherry");

        // Print the elements in both arrays
        System.out.println("Using String[] (array of strings):");
        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }

        System.out.println("Using String[] (array of strings) with a fixed size defined:");
        for (String fruit : fruitsArrayTwo) {
            System.out.println(fruit);
        }

        System.out.println("\nUsing ArrayList<String>:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }
    }
}
