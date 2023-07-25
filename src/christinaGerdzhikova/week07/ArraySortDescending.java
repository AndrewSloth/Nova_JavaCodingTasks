package christinaGerdzhikova.week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySortDescending {

    //3) Array - Sort Descending
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class

    public static int[] sortDescending(int[] arr){

        int[] result = new int[arr.length];

        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }
        for (int i = 0; i < arr.length; i++) {
            result[i] = Collections.max(list);
            list.remove(Collections.max(list));
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 8, 12, 54, 8, 200, -150};

        System.out.println(Arrays.toString(sortDescending(arr)));

    }

}
