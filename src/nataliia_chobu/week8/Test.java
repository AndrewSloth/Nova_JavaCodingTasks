package nataliia_chobu.week8;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString( NuniqueIntegersThatSumUpTo(8)));
    }
// Andrey Naumov's solution
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
}
