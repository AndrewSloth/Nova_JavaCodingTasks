package Erdene.week06;

import SKuzmenko.numbers;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_FindMaximum {

    //    3) Array - Find Maximum
    //Write a method that can find the maximum number from an int Array

    //This method accepts series of numbers and put them in int array and find max number
    public static void find_maximum(int... numbers){
        //puts series of number in array
        int[] array = numbers;

        //creates int to store max number. it should be the lowest value number so any given number will be greater  in value
        int max = Integer.MIN_VALUE;

        //iterate through array
        for(Integer each : numbers){
            // compare them to find max value number
            if(each > max){
                //assign/reassign max value number
                max = each;
            }
        }
        System.out.println("max Number= " + max);
    }

    public static void main(String[] args) {
        find_maximum(-23, 34,45,57,124);
    }
}

