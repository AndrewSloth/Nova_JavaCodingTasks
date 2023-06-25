package andreyNaumov;

import andreyNaumov.week_1.util_week1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("FINRA task");
        util_week1.finra();
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        util_week1.finra1();
        System.out.println();
        System.out.println("------------------------------------------------------------------------");

        System.out.println("OddOrEven Task");
        util_week1.oddOrEven(-5741);
        System.out.println();

        System.out.println("------------------------------------------------------------------------");

        System.out.println("divideNum Task");

        try {
            System.out.println(Arrays.toString(util_week1.divideNum(75,234)));
        } catch (ArithmeticException e){
            System.err.println("You cant dived by 0");
        }

        System.out.println("");

        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("blablablab");

    }
}
