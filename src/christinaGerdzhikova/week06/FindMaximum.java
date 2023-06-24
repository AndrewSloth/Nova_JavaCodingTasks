package christinaGerdzhikova.week06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMaximum {

     //3) Array - Find Maximum
    //Write a method that can find the maximum number from an int Array

    public static int findMaximum(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }
        int result = Collections.max(list);
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {12, 5, 8, 45, 8, 71, 34};

        System.out.println(findMaximum(arr));
    }
}
