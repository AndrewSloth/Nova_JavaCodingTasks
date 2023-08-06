package Erdene.week11;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_FrequencyOfCharacters {

    //Write a method that prints the frequency of each character from a String

    //Creating a method that takes in String to count its chars' freq
    public static void freqOfChar(String string){
        //Making all letters lower case to count uppercase and lowercase
        string = string.toLowerCase();

        //Creating map to store each chars and its number of freq
        Map<String, Integer> chars = new LinkedHashMap<>();

        //Looping through the String that has been split by ""
        for (String each : string.split("")){
            //Using Collections.frequency method to count freq of each char and store it  in following integer.
            int freq = Collections.frequency(Arrays.asList(string.split("")), each);
            //Storing both char and it's freq in map
            chars.put(each, freq    );
        }
        System.out.println(chars);
    }

    public static void freqOfCharWithoutCOll(String str){
        //Making all letters lower case to count uppercase and lowercase
        str = str.toLowerCase();

        //Creating map to store each letter and their corresponding freq numbers, we need hash map so that only unique letters will be stored
        Map<String, Integer> freq = new LinkedHashMap<>();

        //Iterating through str to get each letter
        for (String each : str.split("")){

            //Checking if the specific letter is already in the map
            if(freq.get(each) == null){
                //if not we will put 1 in the freq count
                freq.put(each, 1);
            }else if(freq.get(each) != null){
                //if there is the same letter already in the map we will add one to the freq count
                freq.put(each, freq.get(each) + 1 );

            }
        }
        System.out.println(freq);
    }

    public static void main(String[] args) {
        freqOfChar("aaaabbbcc");
        freqOfCharWithoutCOll("AAABBC");
    }
}
