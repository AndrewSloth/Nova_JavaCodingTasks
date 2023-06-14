package AndrewBalint.week4;

import java.util.*;

public class Week4Tasks {
    public static void main(String[] args) {

        System.out.println(sameLetters("abdfef", "ABeCfD"));

        System.out.println(removeDuplicates("aazzabbbbcccczzz"));

    }


    public static boolean sameLetters(String s1, String s2){

        //Sort first string
        char[] ch = s1.toCharArray();
        Arrays.sort(ch);
        String sorted1 = String.valueOf(ch);

        //Sort second string
        ch = s2.toCharArray();
        Arrays.sort(ch);
        String sorted2= String.valueOf(ch);

        //Compare Strings
        if(sorted1.equalsIgnoreCase(sorted2)) {
            return true;
        }
        else {
            return false;
        }

    }


    public static String removeDuplicates(String str){

        //Split String and add to a LinkedHashSet
        Set<String> hs = new LinkedHashSet<>(Arrays.asList(str.split("")));

        //Put it back together and return it
        String result = "";

        for(String each : hs){
            result+=each;
        }

        return result;

    }





}

/*
String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC

String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */