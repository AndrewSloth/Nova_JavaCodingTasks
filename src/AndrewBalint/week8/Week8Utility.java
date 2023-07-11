package AndrewBalint.week8;


import java.util.Arrays;

public class Week8Utility {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(array_MoveZerosToTheEnd(new int[]{1,0,0,0,0,2,0,3,0,4,0,5,0})));

        System.out.println(Arrays.toString(array_UniqueIntegersThatSumUpTo(2)));

    }

    /*
    Array_MoveZerosToTheEnd
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]*/

    public static int[] array_MoveZerosToTheEnd(int[] input){
        //Create new array to store the adjusted values
        int[] result = new int[input.length];

        //Iterate through the input array. maintain an index in reverse (j) for the zeroes and
        // an index for the regular numbers
        for (int i = 0, j=input.length-1, z=0; i < input.length; i++) {
            if(input[i]==0){ //If the number is a zero, add to the end of the array and adjust the index
                result[j]=input[i];
                j--; //Adjust index
            }
            else{ //If it's NOT a zero, add to beginning of the array and adjust the forward index
                result[z]=input[i];
                z++;
            }
        }

        return result; //Return the new array
    }


/*  Array_NuniqueIntegersThatSumUpTo
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
     */

    public static int[] array_UniqueIntegersThatSumUpTo(int n){

        if( n<=1 || n >= 100){ //Check for invalid argument

            throw new IllegalArgumentException("Number is outside of required boundaries: 1 < N < 100");
        }

        int[] result = new int[n]; //Create a new array for the unique numbers
        int random = 0; //Storing n to calculate random numbers
        int index = 0; //index we are using in the new array

        //If n is odd
        if(n%2!=0){

            result[index]=random;//assign zero to the first array place
            index++; //adjust index

        }

        for (; index< result.length; index+=2) { //increase index by two

            result[index]=--random; //reduce the number by 1 and add
            result[index+1]=random*-1; //get the reverse of the number and add it one index up

        }

        return result; //return result
    }

}
