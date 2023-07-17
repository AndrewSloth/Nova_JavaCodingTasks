package hayrengulPataer.week6;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfDigits {

    public static void main(String[] args) {

        System.out.println(sumOfDigits("c5h2dm7ioqjd6"));



    }



    public static int sumOfDigits(String str) {

        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum += Character.getNumericValue(ch);
            }
        }


     return sum;

}

}





/*
2) String - sum of digits in a string
Write a method that can return the sum of the digits in a string

 */
