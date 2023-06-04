package christinaGerdzhikova.week01;

import java.util.Scanner;

public class DivideWithoutOP {

    public static int Divide(int num1, int num2){
        if (num2 == 0){
            throw new RuntimeException();
        }
       int count = 0;
       while (num1 >= num2){
           num1 -= num2;
           count++;
       }
       return count;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(Divide(num1, num2));



    }
}
//Write a method that can divide two numbers without using division operator
