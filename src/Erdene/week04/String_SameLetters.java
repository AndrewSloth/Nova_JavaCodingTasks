package Erdene.week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_SameLetters {
    /*
    Write a return method that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true
                same("abc", "abb"); -> false:
     */

    public static boolean sameLetters(String first, String second){

        boolean isSame = false;
        for(char each : first.toCharArray() ){
            if(second.contains(each + "")){
                isSame = true;
            }else{
                isSame = false;
            }
        }
            return isSame;

    }

    public static void main(String[] args) {

        System.out.println("sameLetters(\"abc\", \"cab\") = " + sameLetters("abc", "abb"));


    }
}
