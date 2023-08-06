package Erdene.week08;

import java.util.Arrays;

public class Array_MoveZerosToTheEnd {

   /* Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]

    */

    public static void array_MoveZeros(int... numbers){

        int[] input = numbers;
        //Creating an array to store the outputs
        int[] output = new int[input.length];

        //Iterate through the input array finding the zeros and changing their indexes to last index.
        for(int i = 0, j= input.length-1, z=0; i< input.length; i++){
            if(input[i] == 0){  //if the number is zero, move it to the end of the array adjusting its index
                output[j] = input[i];
                j--; // Moving the index one step forward for the next zero;
            }else{
                output[z] = input[i];
                z++;
            }
        }
        System.out.println(Arrays.toString(output));
    }

    public static void main(String[] args) {
        array_MoveZeros(23, 54, 0, 23, 0, 4, 3, 0, 0, 0, 4);
    }


}
