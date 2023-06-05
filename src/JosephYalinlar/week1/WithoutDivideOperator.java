/*
Write a function that divides without using a division operator
 */

package JosephYalinlar.week1;

import java.util.Scanner;

public class WithoutDivideOperator {

    public static int divideWithoutDivideOperator(int number, int divideBy) {

        int divided = 0;
        int dividedNum;

        if (divideBy == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        if (number > 0) {
            do {
                dividedNum = number - divideBy;
                if (dividedNum >= 0) {
                    number = dividedNum;
                    divided++;
                }
            } while (dividedNum >= 0);
        }

        return divided;


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your number to be divided:");
        int num = s.nextInt();

        System.out.println("Please enter your number you want to divide by:");
        int divideBy = s.nextInt();

        System.out.println("Your result is: " + divideWithoutDivideOperator(num, divideBy));
        s.close();
    }
}


