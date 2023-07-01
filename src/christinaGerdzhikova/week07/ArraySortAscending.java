package christinaGerdzhikova.week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySortAscending {

    //2) Array - Sort Ascending
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays

    public static int[] sortAscending(int[] arr){

        int[] result = new int[arr.length];

        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }
        for (int i = 0; i < arr.length; i++) {
            result[i] = Collections.min(list);
            list.remove(Collections.min(list));
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};

        System.out.println(Arrays.toString(sortAscending(arr)));
    }


}
