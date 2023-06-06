package AndrewBalint.week3;

import java.util.*;

public class Week3Utility {
    public static void main(String[] args) {

        System.out.println(isPrime(31));

        try{
            System.out.println(reverseNegative(-100));
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }

        System.out.println(frequencyOfChars("AAABBBCCCDDD"));


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
                break;
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

        String numberString = Integer.toString(neg);
        String result = "";

        for(int i = numberString.length()-1; i>=0;i--){
            result+=""+numberString.charAt(i);
        }


        return Integer.parseInt(result.substring(0,result.length()-1));
    }

    public static String frequencyOfChars(String entry){
        /*
            3) String - Frequency of Characters
            Write a return method that can find the frequency of characters
            Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2**
         */


        //check for null or empty string
        if(entry==null||entry.isEmpty()) {
            System.out.println("String cannot be null or empty");
            System.exit(1);
        }

        String result =""; //Resulting string

        //Map for storing char and freq without duplicates
        Map<String, Integer> splits = new LinkedHashMap<>();


        //go through collection and get frequencies of each char
        for (String each : entry.split("")){
            int freq = Collections.frequency(Arrays.asList(entry.split("")), each);

            //Add data to the map
            splits.put(each, freq);

        }

        //Go through the map and add chars to the result string
        for (String each : splits.keySet()) {
            result+=each+splits.get(each);

        }

        return result;
    }
}