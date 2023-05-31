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
