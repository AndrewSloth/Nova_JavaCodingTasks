package mariiaSuzdal.week_8;

import java.util.Arrays;

public class Array_MoveZerosToTheEnd {
    public static void main(String[] args) {

        int[] numbers = {1, 0, 27, 0, 3, 0, 33, 0};
        System.out.println(Arrays.toString(moveZero(numbers)));
    }

    public static int[] moveZero(int[] list) {

// I create a new array and the length is equal to the list length
        int[] newList = new int[list.length];
// I create int where I will store index of the new array
        int index = 0;
//I create a loop
        for (int each : list) {
//I create if statement if each in the array not equal to 0  =>
            if (each != 0) {
//I will add to the new List each from the list and will move to the next index in the next iteration by increasing the index
                newList[index++] = each;
            }
        }

        return newList;
    }
}
/*
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */