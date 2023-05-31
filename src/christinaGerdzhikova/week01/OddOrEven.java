package christinaGerdzhikova.week01;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(OddOrEvenNum(scan.nextInt()));
    }

    public static String OddOrEvenNum (int num){

        if (num % 2 == 0){
            return "Even";
        }
        return "Odd";
    }
}
