package Erdene.week09;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_concat2Arrays {
    /*
        Array_concatArrays
Write a return method that can concatenate two arrays
     */


    public static void Array_concatArrays(int[] array1, int[] array2){

        //Creating two arrays to store given numbers

        //Creating an array to store both given arrays
        Object[] output = new Object[array1.length + array2.length];

        //moving first array to output array
        for(int i = 0; i< array1.length; i++){
            output[i] = array1[i];
        }

        //moving second array to output array
        for(int i = array1.length, j=0; i<output.length; i++, j++){
            output[i] = array2[j];
        }

        System.out.println("Arrays.toString(output) = " + Arrays.toString(output));


    }


    public static void main(String[] args) {
        Array_concatArrays(new int[]{1,2,4,5,6,7,8,12}, new int[]{2,5,6,8,9,0,14,15});
    }

}
