package Erdene.week11;

import Erdene.week06.Array_FindMaximum;
import SKuzmenko.numbers;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map_MinValue {
    //Write a method that can return the minimum value from a map (DO NOT use sort method)

    public static void minValue(int... n){
        //Storing given numbers in map, map length should be same as amount of numbers given
        Map<Integer, Integer> numbers = new LinkedHashMap<>(n.length);
        //iterating through given numbers, putting them in map, I take it's indexes as keys.
        for (int i = 0; i < n.length; i++) {
            numbers.put(i, n[i]);
        }


        // Assigning max value to minimum so it will be easier to find minimum numbers
        int minimum = Integer.MAX_VALUE;
        //Getting all the keys from map
        Set<Integer> keys = numbers.keySet();
        //Iterating through all keys and calling its corresponding value and comparing it to minimum variable
        for (Integer each : keys  ){
            //if value is less than minimum variable it will be stored in minimum variable
            if(numbers.get(each) < minimum){
                minimum = numbers.get(each);
            }

        }
        System.out.println(minimum);
    }


    public static void main(String[] args) {
        minValue(12,34,56,1,-234,3456);
    }
}
