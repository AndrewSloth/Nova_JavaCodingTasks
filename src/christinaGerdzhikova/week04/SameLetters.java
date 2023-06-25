package christinaGerdzhikova.week04;

import java.util.Arrays;

public class SameLetters {

    //String -- Same letters
    //Write a return method that check if a string is build out of the same letters as another string.
    //Ex: same("abc", "cab"); -> true
    //same("abc", "abb"); -> false:

    public static boolean sameLettersMethod(String word1, String word2){
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        String result1 = "";
        String result2 = "";


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (char each : arr1) {
            result1 += each;
        }

        for (char each : arr2) {
            result2 += each;
        }


        if (result1.equals(result2)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String word1 = "cab";
        String word2 = "abc";

        System.out.println("sameLettersMethod(word1, word2) = " + sameLettersMethod(word1, word2));
    }
}
