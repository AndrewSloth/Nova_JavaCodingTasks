package Erdene.week10;

import SKuzmenko.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_sortingInAscending {

    // Write a method that can sort the ArrayList in Ascending order without using the sort method.

    //Creating a public method with Arraylist of Integer.
    public static void sortAscending(ArrayList<Integer> list){
        // Using sort method from collections to sort numbers in asc
        Collections.sort(list);
        //Printing list to see the order of numbers.
        System.out.println("list = " + list);
    }


    public static void main(String[] args) {
        sortAscending(new ArrayList<>(Arrays.asList(12, 34, 56, 11, 2, 142, 11)));
    }
}
