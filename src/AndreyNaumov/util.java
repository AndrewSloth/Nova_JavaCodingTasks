package AndreyNaumov;

// blalslbslbs
/*
 *Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
 *print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
 *For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
public class util {
    /**
     * Prints numbers from 1 to 30 and change numbers which are divisible without remainder
     * by 3 & 5 to "FINRA"
     * by 3  to "FIN"
     * by 5 to "RA"
     */
    public static void finra() {
        for (int i = 1; i < 31; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }

        }
    }

    public static void finra1() {
        String result = "";
        for (int i = 1; i < 31; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += "FINRA ";
            } else if (i % 3 == 0) {
                result += "FIN ";
            } else if (i % 5 == 0) {
                result += "RA ";
            } else {
                result += i + " ";
            }
        }
        System.out.println(result);
    }

    /*
    Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
     */

    /**
     * Print the number and determine odd or even
     *
     * @param num integer number
     */
    public static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " Is even number");
        } else {
            System.out.println(num + " Is odd number");
        }
    }


    /*
Write a method that can divide two numbers without using division operator
 */


    /** Returns integer quotient and remainder of the division
     * @param dividend
     * @param divisor
     * @return array with 2 integers
     * [0] is integer quotient
     * [1] is remainder of the division
     */

    public static int[] divideNum(int dividend, int divisor) {
        int[] arr = new int[2];
        if (dividend == 0) {
            arr[0] = 0;
            return arr;
        }
        if (divisor == 0) {
            throw new ArithmeticException("division by 0");
        }

        boolean isNegative = false;

        if (dividend < 0) {
            isNegative = true;
            dividend *= -1;
        }
        if (divisor < 0) {
            isNegative = true;
            divisor *= -1;
        }

        int result = 0;

        while (dividend > divisor) {
            dividend -= divisor;
            result += 1;
        }
        int reminder = dividend;

        if (isNegative) {
            result *= -1;
        }
        arr[0] = result;
        arr[1] = reminder;

        return arr;
    }


}
