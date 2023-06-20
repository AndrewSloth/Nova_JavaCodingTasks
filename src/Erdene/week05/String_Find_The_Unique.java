package Erdene.week05;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class String_Find_The_Unique {
    //3.String -- Find the unique
    //Write a return  method that can find the unique characters from the String
    //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

    //in this task we are going to use Set since it doesn't accept any duplications.
    //      to have insertion order, we choose LinkedHashSet.

    public static void unique(String str){
        //Creating LinkedHashSet to remove duplication while keeping insertion order.
        LinkedHashSet<String> uni = new LinkedHashSet<>();

        //Splitting Strings into chars and converting them into Arrays to add them all into set
        uni.addAll(Arrays.asList(str.split("")));

        //Creating String to store result of unique letters.
        String res = "";

        //Iterating through Set to get each letters and storing them in the result String
        for( String each : uni){
            res += each;
        }
        //Printing out the result
        System.out.println(res);
    }

    public static void main(String[] args) {
        unique("AAadaffff5555444BBC");
    }
}
