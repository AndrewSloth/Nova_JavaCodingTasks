package mariiaSuzdal.week_6;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println(sumOfDigitsTask("5789"));
        System.out.println(sumOfDigitsTask2("10,20,10"));
    }

    //first solution

    public static int sumOfDigitsTask(String numbers) {

//create int "sum of digits" with 0 value
        int sumOfDigits = 0;

//create a for loop, where iterate "numbers" on length
        for (int i = 0; i < numbers.length(); i++) {
//convert each i in "numbers" to the char
            char ch = numbers.charAt(i);
// add numeric of value of each char to the int "sum of digits"
            sumOfDigits += Character.getNumericValue(ch);
        }

        return sumOfDigits;
    }


    //second solution

    public static int sumOfDigitsTask2(String numbers) {

//create int "sum of digits" with 0 value
        int sumOfDigits = 0;
//add all numbers from the string to the arraylist abd split each number where we have ","
        ArrayList<String> list = new ArrayList<>(Arrays.asList(numbers.split(",")));
//crete for each loop
        for (String each : list) {
//add each int to the int "sum of digits"
            sumOfDigits += Integer.parseInt(each);
        }

        return sumOfDigits;
    }
}
/*
Write a method that can return the sum of the digits in a string
 */