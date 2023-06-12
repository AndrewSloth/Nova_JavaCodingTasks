package mariiaSuzdal.week_3;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println(number(3));

    }

    public static boolean number(int num) {

        if (num < 1) {
            return false;
        }


        for (int i = 2; i <= num - 1; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }


}
/*
Write a method that can check if a number is prime or not
 */