package nataliia_chobu.week1;

import java.util.Arrays;
import java.util.Collections;

public class Divide {
    public static void main(String[] args) {
//divideWithoutDivisionOperator(-12,5);
        divideWithoutOperator(80, 8);

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







