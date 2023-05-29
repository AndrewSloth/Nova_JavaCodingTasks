package akmalSalomov;

public class DivideWithoutOperator {

    public static void main(String[] args) {

        divideTwoNumbers(20, 10);
    }

    public static void divideTwoNumbers(int a, int b) {
        int count = 0;
        while (a >= b) {
            a -= b;
            count++;
        }
        System.out.println(count);


    }
}
/*
NDivide without / operator:numbers -
Write a method that can divide two numbers without using division operator
 */
