package hayrengulPataer.week3;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(8));
    }

    public static boolean isPrime(int num){

        for(int i = 2; i <= num/2; i++){
            if(num % i== 0){
                return false;
            }
        }
        return true;
    }

}
/*
Write a method that can check if a number is prime or not
prime number is divisible only by and itself
 */
