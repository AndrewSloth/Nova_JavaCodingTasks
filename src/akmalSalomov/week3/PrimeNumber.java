package akmalSalomov.week3;

public class PrimeNumber {

    static void checkPrime(int n){

        // Write a method that can check if a number is prime or not

        int i , m = 0, f = 0;


        m = n/2;
        if(n == 0 || n == 1){
            System.out.println(n + " is not prime number");
        }else{
            for (int j = 2; j <= m ; j++) {
                if(n % j == 0){
                    System.out.println(n + " is not prime number");
                    f = 1;
                    break;
                }
            }
            if(f == 0){
                System.out.println(n + " is prime number");
            }
        }

    }

    public static void main(String[] args) {


        checkPrime(1);
        checkPrime(3);
        checkPrime(19);
        checkPrime(21);
        checkPrime(23);


    }

}
