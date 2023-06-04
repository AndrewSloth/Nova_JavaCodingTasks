package christinaGerdzhikova.week03;

import java.util.Scanner;

public class ReverseNegativeNum {

    public static int reverseNegative(int num){

        if (num > 0){
            System.out.print("Invalid number: ");
            return num;
        }

        int count = 0;
        for (int i = num; i < 0; i++) {
            count++;
        }

        return count;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println(reverseNegative(num));
    }
}
