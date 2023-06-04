package Erdene.week03;

public class Numbers_PrimeNumber {

    public static void primeNumber(int N){
        boolean notPrime = false;
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                notPrime = true;
                break;
            }
        }

        if(!notPrime){
                System.out.println(N + " is a Prime Number");
            }else{
                System.out.println(N + " is not a Prime Number");
            }
        }


    public static void main(String[] args) {
        primeNumber(29);
    }
}
