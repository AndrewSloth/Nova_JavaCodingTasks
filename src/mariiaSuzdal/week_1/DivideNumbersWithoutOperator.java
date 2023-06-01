package mariiaSuzdal.week_1;

public class DivideNumbersWithoutOperator {
    public static void main(String[] args) throws Exception {

        withoutOperator(10, -2);

    }

    public static void withoutOperator(int num1, int num2) throws Exception {

        if (num1 <= 0 || num2 <=0) {
            throw new Exception("Numbers can not be negative or zero");
        }

        int answer = 0;

        while (num1 >= num2) {
            num1 -= num2;
            answer++;
        }
        System.out.println("Answer is " + answer);


    }
}
/*
Write a method that can divide two numbers without using division operator
 */