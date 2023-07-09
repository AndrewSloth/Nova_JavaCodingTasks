package mariiaSuzdal.week_7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, -1, 0};
        System.out.println(Arrays.toString(sortAscending(arr)));

    }

    public static int[] sortAscending(int[] arr) {

//I create a first loop that starts from the first element and go through the whole array
        for (int i = 0; i < arr.length; i++) {
//I create a second loop that starts from the first element and go through the array except the last element
            for (int j = 0; j < arr.length - 1; j++) {
//I create if statement where I check if the value of j MORE than next j value
                if (arr[j] > arr[j + 1]) {
//I create a temporary variable where I will store j value that I will swap
                    int temp = arr[j];
//I swapped first and second j value by assign second j value to the first j value
                    arr[j] = arr[j + 1];
//I reassigned temp value into second j value
                    arr[j + 1] = temp;
                }
            }

        }

        return arr;
    }


}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
 */