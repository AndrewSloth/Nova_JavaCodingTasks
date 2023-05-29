package christinaGerdzhikova;

import java.util.Scanner;

public class DivideWithoutOP {

    public static int Divide(int num1, int num2){
       int count = 0;
       while (num1 >= num2){
           num1 -= num2;
           count++;
       }
       return count;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(Divide(scan.nextInt(), scan.nextInt()));

    }

}
