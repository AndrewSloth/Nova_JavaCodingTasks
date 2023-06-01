package nataliia_chobu.week3;

public class PrimeNumber {
    /*
    Write a method that can check if a number is prime or not
     */
    public static void main(String[] args) {
        System.out.println(isPrime(113));
    }
    public static boolean isPrime(int num) {

        int count = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}