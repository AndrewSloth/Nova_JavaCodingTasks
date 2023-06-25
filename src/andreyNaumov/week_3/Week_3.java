package andreyNaumov.week_3;

import jdk.jfr.Frequency;
import nataliia_chobu.week3.FrequencyOfCharacters;

import java.util.*;

public class Week_3 {


    /*
    3) String - Frequency of Characters
    Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2**

     */

    /**
     * 1) Numbers - Prime Number
     * Write a method that can check if a number is prime or not
     *
     * @param num integer
     * @return true if num is prime.
     */
    private static boolean primeNum(int num) {
        if (num <= 0) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * 2) Number - Reverse negative number
     * Write a return method that can reverse negative number and return it as int
     */

    private static int revNegNum(int num) {
        if (num < 0) {
            num *= -1;
        }
        return num;
    }


    /**
     * 3) String - Frequency of Characters
     * Write a return method that can find the frequency of characters
     * Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2**
     */

    private static String freq_Of_Ch(String str) {
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
            result += " " + ch + map.get(ch);
        }


        return result;
    }

    private static Map freq_Of_Ch_map(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.replace(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }



        return map;
    }


    public static void main(String[] args) {

        System.out.println("primeNum");
        System.out.println(primeNum(13));

        System.out.println("--------------------------------------------------");
        System.out.println("revNegNum");
        System.out.println(revNegNum(-576));

        System.out.println("--------------------------------------------------");
        System.out.println("freq_Of_Ch");
        System.out.println(freq_Of_Ch("asdlkjhflsadiufhiup839238   wdfhpiwequh p204 ^^*3272ijed &@^#"));
        System.out.println("--------------------------------------------------");
        System.out.println("freq_Of_Ch_map");
        System.out.println(freq_Of_Ch_map("asdlkjhflsadiufhiup839238   wdfhpiwequh p204 ^^*3272ijed &@^#"));



    }

}



