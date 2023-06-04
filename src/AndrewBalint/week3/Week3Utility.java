package AndrewBalint.week3;

import java.util.InputMismatchException;

public class Week3Utility {
    public static void main(String[] args) {

        //System.out.println(isPrime(31));

        try{
            System.out.println(reverseNegative(14));;
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }



    }


    public static boolean isPrime(int num) {

        /*
        1)  Numbers - Prime Number
            Write a method that can check if a number is prime or not
         */

        //Prime numbers must be greater than one
        if(num<=1){
            return false;
        }

        boolean isPrime = true;

        for(int i = 2; i <num; i++){
            if(num%i==0) {
                isPrime = false;
            }
        }



        return isPrime;

    }

    public static int reverseNegative(int neg){

        /*
         2) Number - Reverse negative number
            Write a return method that can reverse negative number and return it as int
         */

        if(neg>=0){
            throw new InputMismatchException("Invalid input. Input must be a negative number.");
        }

        neg = neg*(-1);

        return neg;
    }

    public static String frequencyOfChars(String entry){
        /*
            3) String - Frequency of Characters
            Write a return method that can find the frequency of characters
            Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2**
         */
        String result ="";

        return result;
    }
}