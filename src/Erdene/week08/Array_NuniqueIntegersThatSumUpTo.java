package Erdene.week08;

import java.util.Arrays;

public class Array_NuniqueIntegersThatSumUpTo {

    /*
    Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
    The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
     */

    public static void array_UniqueIntegersThatSumUpTo(int n){

        if( n<=1 || n >= 100){ //Check for invalid argument

            throw new IllegalArgumentException("Number should be: 1 < N < 100");
        }

        int[] output = new int[n]; //Creating an array to store the unique numbers
        int random = 0; //Storing random numbers
        int index = 0; //new array index

        //If n is odd
        if(n%2!=0){

            output[index]=random;//assigning zero to the first array place
            index++; //moving an index up for next one

        }

        for (; index< output.length; index+=2) { //increase index by two

            output[index]=--random; //reduce the number by 1 and to new array
            output[index+1]=random*-1; //reverse the number and add it one index up

        }

        System.out.println("Arrays.toString(output) = " + Arrays.toString(output));
    }

    public static void main(String[] args) {
        array_UniqueIntegersThatSumUpTo(5);
    }

}






