package akmalSalomov.week6;


import java.util.Arrays;

/*
Write a method that can find the maximum number from an int Array
 */
public class ArrayFindMaximum {

    public static int maximumNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        /*
        I have initialized an integer variable max to the first element of the array assuming the array has
        at least one element. After that I looped through the remaining elements of the array using for loop.
        For each element it checks if it is greater than the current maximum value max. If it is than it updates
        the value of max to value of the current element.

         */
        return max; // returns the value of max which is the maximum value in the array
        //
    }

    public static void main(String[] args) {


    }
}
