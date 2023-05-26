package AndrewBalint;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = in.nextInt();

        System.out.println("Enter a second number: ");
        int num2 = in.nextInt();

        num2+=num1;
        num1 = num2-num1;
        num2 = num2-num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);



    }


}

