package Erdene.week03;

//Write a method that can check if a number is prime or not
public class Numbers_PrimeNumber {

    public static void primeNumber(int N){
        boolean notPrime = false;

        if(N<=1){
            notPrime = true;
        }

        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                notPrime = true;
                break;
            }
        }

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
