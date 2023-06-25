package christinaGerdzhikova.week06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumOfDigitsInString {

     //2) String - sum of digits in a string
    //Write a method that can return the sum of the digits in a string

    public static int sumOfDigits(String str){

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt("" + str.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("Goblin12358"));
    }










}
