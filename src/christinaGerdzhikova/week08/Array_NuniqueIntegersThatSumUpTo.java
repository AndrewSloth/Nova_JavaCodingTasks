package christinaGerdzhikova.week08;

import java.util.Arrays;

public class Array_NuniqueIntegersThatSumUpTo {

    public static int[] nUniqueIntegersThatSumUpTo(int n){

        int[] arr = new int[n];

        int positive = 1;
        int negative = -1;

        if (n % 2 != 0){
            int middleIndex = n/2;
            arr[middleIndex] = 0;

            for (int i = 0; i < middleIndex; i++) {
                arr[i] = negative;
                negative--;
            }
            for (int i = arr.length-1; i > middleIndex; i--) {
                arr[i] = positive;
                positive++;
            }
            return arr;
        }

        for (int i = 0, j = arr.length-1; i < j; j--, i++) {
            arr[i] = negative;
            arr[j] = positive;

            positive++;
            negative--;
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(nUniqueIntegersThatSumUpTo(10)));
    }

}
