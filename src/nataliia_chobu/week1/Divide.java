package nataliia_chobu.week1;

import java.util.Arrays;
import java.util.Collections;

public class Divide {
    public static void main(String[] args) {
//divideWithoutDivisionOperator(-12,5);
        divideWithoutOperator(80, 8);

        int[][] arr = new int[][]{{1, 2}, {3, 4}};
        arr[1] = arr[0];
        System.out.println(Arrays.toString(arr[0]));

        int[][] arr1 = {{1, 2, 3}, {3, 4}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr1[i][j] + " ");
            }
        }





    }


    public static void divideWithoutDivisionOperator(int a, int b) {


        if (a <= 0 || b <= 0) {
            System.err.println("Zero and negative numbers are not accepted. Given dividend is \"" + a + "\", given divisor is \"" + b + "\".");
        }
        System.exit(0);
        int result = 0;
        while (a >= b) {

            a -= b;
            result++;
        }

        System.out.println(result);

    }

    public static void divideWithoutOperator(int a, int b) {
        int result = 0;
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Numbers can not be Zero or Negative: a=" + a + ", b=" + b);
        }
        while (a >= b) {
            a -= b;
            result++;
        }
        System.out.println(result);
    }
}







