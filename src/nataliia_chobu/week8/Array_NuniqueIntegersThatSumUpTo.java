package nataliia_chobu.week8;


import java.util.Arrays;


public class Array_NuniqueIntegersThatSumUpTo {
//  Array_NuniqueIntegersThatSumUpTo
//Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
//The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
//The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
//For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
    //Chat GPT solution

    public static void main(String[] args) {

        System.out.println(Arrays.toString(array_NuniqueIntegersThatSumUpToZero(8)));
    }


    public static int[] array_NuniqueIntegersThatSumUpToZero(int num) {

        if(num<1 || num>100){
            throw new IllegalArgumentException();
        }

        int[] result = new int[num];
        int sum = 0;
        for (int i = 0; i < num - 1; i++) {
            result[i] = i;
            sum += i;
        }
        result[num - 1] = -sum;
        return result;

    }

}


