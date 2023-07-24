package christinaGerdzhikova.week08;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_MoveZerosToTheEnd {

    public static int[] moveZerosToTheEnd(int[] arr){

        int[] result = new int[arr.length];
        int zeroCount = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {
            if (each == 0){
                zeroCount++;
                continue;
            }
            list.add(each);
        }

        for (int i = 0; i < zeroCount; i++) {
            list.add(0);
        }

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4,0};

        System.out.println(Arrays.toString(moveZerosToTheEnd(arr)));

    }

}
