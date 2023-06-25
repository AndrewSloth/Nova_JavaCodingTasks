/*
Write a method that can check if a number is prime or not
 */


package JosephYalinlar.week3;

public class PrimeNum {
    public boolean checkPrimeNum(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
