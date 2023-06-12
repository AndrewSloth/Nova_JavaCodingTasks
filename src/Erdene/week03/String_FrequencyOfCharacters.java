package Erdene.week03;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/*
  3) String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2**
 */
public class String_FrequencyOfCharacters {

    public static Map<String, Integer> Frequency(String str){

        //Map for unique Characters of the String and frequency of that Character
        Map<String, Integer>freqOfString = new LinkedHashMap<>();

        //iterating through String and finding frequency using Collection.frequency
        for(String each : str.split("")){
            int freq = Collections.frequency(Arrays.asList(str.split("")), each);

            //putting unique Character along with frequency number
            freqOfString.put(each, freq);
        }
        return freqOfString;
    }

    public static void main(String[] args) {
        System.out.println(Frequency("AAABBCDD"));
    }
}
