package andreyNaumov.week_8;

import java.util.Arrays;

public class Week_8 {

    //Array_MoveZerosToTheEnd
    //Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    //input:  {1,0,2,0,3,0,4,0};
    //output: [1, 2, 3, 4, 0, 0, 0, 0]
    //

    public static int[] moveZerosToTheEnd(int[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException();
        }
        int[] result = new int[arr.length];
        int index = 0;
        for (int each : arr) {
            if (each != 0) {
                result[index] = each;
                index++;
            }
        }
        return result;
    }


    //Array_NuniqueIntegersThatSumUpTo
    //Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    //The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
    //The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
    //For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).

    public static int[] NuniqueIntegersThatSumUpTo(int n) {
        if (n < 1 || n >= 100) {
            throw new IllegalArgumentException();
        }
        if (n == 2) {
            int[] result = new int[]{-1, 1};
            return result;
        }
        int[] result = new int[n];

        int count = 0;
        for (int i = 0, j = 0; i < n - 1; i++, j++) {
            result[i] = j;
            count += j;
        }
        result[n - 1] = count * (-1);

        return result;
    }


    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 0, 2, 0, 3, 0, 4, 0};
        long t1 = 0;
        long t2 = 0;

        System.out.println("-------------sortAsc------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("sortAsc(arr1) = " + Arrays.toString(moveZerosToTheEnd(arr1)));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();

        System.out.println("-------------NuniqueIntegersThatSumUpTo------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("NuniqueIntegersThatSumUpTo(n) = " + Arrays.toString(NuniqueIntegersThatSumUpTo(13 )));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();
    }

}



