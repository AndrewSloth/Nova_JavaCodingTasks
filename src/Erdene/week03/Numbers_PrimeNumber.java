package Erdene.week03;

//Write a method that can check if a number is prime or not
public class Numbers_PrimeNumber {

    public static void primeNumber(int N){

        // local boolean for printing out if a number is Prime or not
        boolean notPrime = false;

        // if number is negative, it's not a Prime
        if(N<=1){
            notPrime = true;
        }

        // iterating 2 to given number to see if it can divide the given number without any remaining, if it does, given number is not a Prime
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                notPrime = true;
                break;
            }
        }

        // (!notPrime) means any of above conditions are not met thus given is Prime
        if(!notPrime){
                System.out.println(N + " is a Prime Number");
            }else{
                System.out.println(N + " is NOT a Prime Number");
            }
        }


    public static void main(String[] args) {
        primeNumber(-29);
    }
}
