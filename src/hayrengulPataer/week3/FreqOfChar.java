package hayrengulPataer.week3;

import java.util.HashMap;
import java.util.*;

public class FreqOfChar {

    public static void main(String[] args) {

        System.out.println(FreqOfChar("AAABBCDD"));
    }

   public static String FreqOfChar(String str){
        Map<Character, Integer> map = new HashMap<>();


           for (int i = 0; i < str.length(); i++) {
               char ch = str.charAt(i);
               if (map.containsKey(ch)) {
                   map.replace(ch, map.get(ch) + 1);
               } else {
                   map.put(ch, 1);
               }
           }
           String result = "";
           for (Character ch : map.keySet()) {
               result += "" + ch + map.get(ch);
           }


           return result;
       }






   }






/*
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2**
 */
