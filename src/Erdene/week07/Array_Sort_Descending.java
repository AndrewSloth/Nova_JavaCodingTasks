package Erdene.week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_Sort_Descending {

    //  3) Array - Sort Descending
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex:  int[] arr = {10,20,7, 8, 90};
    //                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
    public static ArrayList<Integer> array_sortAscending(int... arr){
        //takes given numbers and put them in array and print them
        int[] nums = arr;
        System.out.println("Given: " + Arrays.toString(nums));

        // we use Collections.sort method to sort them in descending order. To do that we need ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // let's put given arr into numbers
        for(int each : nums){
            numbers.add(each);
        }

        //now lets sort them using Collections.sort
        Collections.sort(numbers, Collections.reverseOrder());

        return numbers;
    }

    public static void main(String[] args) {
        System.out.println("Sorted: " + array_sortAscending(23, 6, 2, 8, 15, -23));
    }
}
