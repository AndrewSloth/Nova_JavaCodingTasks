package Erdene.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List_RemoveSomeValues {

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
     */

    public static void removeGreaterThanHundred(int... numbers){
        //Creating list of Integers to store given numbers

        List<Integer> listOfNumbers = new ArrayList<>();

        //Iterating through given numbers and if given number is equal or less than a hundred it will be added to listOfNumbers.

            for(int each : numbers){
                if(each <= 100 ) {
                    listOfNumbers.add(each);
                }
            }


        System.out.println("listOfNumbers = " + listOfNumbers);
    }


    public static void main(String[] args) {
        removeGreaterThanHundred(12,23,5,56,67,123,123,234,5453,457,2345);
    }




}
