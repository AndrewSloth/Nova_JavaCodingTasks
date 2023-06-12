package christinaGerdzhikova.week03;

import java.util.Scanner;

public class PrimeNumbers {

    public static void isPrime(int num){
        int count = 0;
        for (int i = num; i >= 1 ; i--) {
            if (num % i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println(num + " is a prime number");
        }else if (count > 2){
            System.out.println(num + " is not a prime number");
        }else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        isPrime(num);

        //Write a method that can check if a number is prime or not
    }
}
