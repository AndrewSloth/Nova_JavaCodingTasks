package mariiaSuzdal.week_8;

import java.util.Arrays;

public class Array_NuniqueIntegersThatSumUpTo {
    public static void main(String[] args) {

        int[] result = findArray(5);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findArray(int number) {

// I created an array with the length from the given number
        int[] arr = new int[number];
// I created two int with 1 and -1 value
        int positive = 1;
        int negative = -1;
// I created a for loop with two pointers, the loop wil start from start and from the end of the array
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
// I will add value of positive number to the i in my array (at the start of the array)
            arr[i] = positive;
// I will add value of negative number to the j in my array (at the end of the array)
            arr[j] = negative;
// I will increase the value of the positive number in each iteration 1->2->3 ....
            positive++;
// I will decrease the value of the negative number in each iteration -1-> -2-> -3 ....
            negative--;
        }
        return arr;
    }

}
/*
Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
 */