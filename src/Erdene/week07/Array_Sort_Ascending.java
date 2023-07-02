package Erdene.week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_Sort_Ascending {

    //    2) Array - Sort Ascending
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex:
    //            int[] arr = {10, 9, 8, 7};
    //             arr = Sort(arr);         ==>{ 7, 8, 9, 10};

    public static ArrayList<Integer> array_sortAscending(int... arr){
        //takes given numbers and put them in array and print them
        int[] nums = arr;
        System.out.println("Given: " + Arrays.toString(nums));

        // we use Collections.sort method to sort them in ascending order. To do that we need ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // let's put given arr into numbers
        for(int each : nums){
            numbers.add(each);
        }

        //now lets sort them using Collections.sort
        Collections.sort(numbers);

        return numbers;
    }

    public static void main(String[] args) {
        System.out.println("Sorted: " + array_sortAscending(23, 5, 6, 7, 8, -23));
    }
}
