package Erdene.week05;

import java.util.*;

public class String_Find_The_Unique {
    //3.String -- Find the unique
    //Write a return  method that can find the unique characters from the String
    //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

    //in this task we are going to use Set since it doesn't accept any duplications.
    //      to have insertion order, we choose LinkedHashSet.

    public static void unique(String str){
        //Creating String to store result of unique letters.
        String res = "";
        //Creating ArrayList to use Collections.frequency() mehtod
        ArrayList<String> uni = new ArrayList<>();

        //Splitting Strings into chars and converting them into Arrays to add them all into set
        uni.addAll(Arrays.asList(str.split("")));

        // This int 'freq' is to store frequency number of each letters in the String
        int freq = 0;

        // Iterating through "uni" ArrayList to get frequency of each letters
        for( String each : uni) {
            //Storing each letter's  freq number
            freq = Collections.frequency(uni, each);
            // if freq number is one, meaning it's UNIQUE, we store it in our result String
            if( Collections.frequency(uni, each) == 1)
                res += each;
            }

        //Printing out the result
        System.out.println(res);
    }



    public static void main(String[] args) {
        unique("AAAaBBBcDD");

    }
}
