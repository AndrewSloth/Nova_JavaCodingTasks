package AndreyNaumov;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("FINRA task");
        util.finra();
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        util.finra1();
        System.out.println();
        System.out.println("------------------------------------------------------------------------");

        System.out.println("OddOrEven Task");
        util.oddOrEven(-5741);
        System.out.println();

        System.out.println("------------------------------------------------------------------------");

        System.out.println("divideNum Task");

        try {
            System.out.println(Arrays.toString(util.divideNum(75,234)));
        } catch (ArithmeticException e){
            System.err.println("You cant dived by 0");
        }

        System.out.println("");

        System.out.println("------------------------------------------------------------------------");
        System.out.println("blablablab");

    }
}
