package christinaGerdzhikova.week01;

import java.util.Scanner;

public class FINRA {

    public static String Finra (int num){
        if (num % 3 ==0 && num % 5 ==0){
            return "FINRA";
        }
        if (num % 3 ==0){
            return "FIN";
        }
        if (num % 5 ==0){
            return "RA";
        }

        return "No Matches";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(Finra(scan.nextInt()));
    }
}
/*Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
