package hayrengulPataer.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class SameLetters {

    public static void main(String[] args) {
        System.out.println(sameLetters("cde", "edc"));
    }

    public static boolean sameLetters(String str1, String str2) {

        boolean isSame = true;

        for (int i = 0; i < str2.length(); i++) {
            if (!str2.contains(str1.charAt(i) + "") || !str1.contains(str2.charAt(i) + "")) {
                isSame = false;
            }
        }

        return isSame;
    }


}


/*
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

 */
