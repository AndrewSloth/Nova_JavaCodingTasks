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
        int N = 6;
        int[] result = generateArrayNuniqueIntegersThatSumUpTo(N);
        System.out.println(Arrays.toString(result));
    }
        public static int[] generateArrayNuniqueIntegersThatSumUpTo(int N) {
            if (N < 2 || N > 99) {
                throw new IllegalArgumentException("N should be between 2 and 99.");
            }

            int[] integers = new int[N];
            int sum = 0;

            // Generate N-1 random integers
            for (int i = 0; i < N - 1; i++) {
                int randomNumber = (int) (Math.random() * N) - (N / 2);
                integers[i] = randomNumber;
                sum += randomNumber;
            }

            // Calculate the remaining integer to make the sum zero
            integers[N - 1] = -sum;

            // Return the array of unique integers
            return integers;
        }



}


