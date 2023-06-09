package akmalSalomov.week4;

import java.util.Arrays;

public class SameLetters {

        /*
        Write a return method that check if a string is build out of the same letters as another string.
        Ex: same("abc", "cab"); -> true
        same("abc", "abb"); -> false:
         */


    public static boolean sameLetters(String str1, String str2) {
        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");
        // Converted both strings to lowerCase and removed spaces

        if (str1.length() != str2.length()) { // checked both strings have the same length
            return false;
        }

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        // Converted both strings to Arrays of characters and sorted them

        if (Arrays.equals(str1Array, str2Array)) {
            return true;
        } else{
            return false;
        }

    }

    public static void main(String[] args) {


        System.out.println(sameLetters("abcd","abcd")); // true
        System.out.println(sameLetters("cbd","bcd")); // true
        System.out.println(sameLetters("abcd", "kgda")); // false
    }


}
