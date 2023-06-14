package nataliia_chobu.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    /*
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2**
 */
    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("AAABBCDD"));
    }

    public static String frequencyOfCharacters(String str){
        String result="";

        String [] strArray=str.split("");
        ArrayList<String> strArrayList=new ArrayList<>(Arrays.asList(strArray));

        for (String eachChar : strArrayList) {
           int frequency= Collections.frequency(strArrayList,eachChar);
           if(!result.contains(eachChar)){
               result+=eachChar+frequency;
           }
        }

        return result;

    }

}
