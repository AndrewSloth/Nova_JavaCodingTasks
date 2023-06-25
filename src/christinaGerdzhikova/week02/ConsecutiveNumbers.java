package christinaGerdzhikova.week02;

import java.util.Scanner;

public class ConsecutiveNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                if (i % 2 == 0) {
                    System.out.print("Codility");
                }
                if (i % 3 == 0) {
                    System.out.print("Test");
                }
                if (i % 5 == 0) {
                    System.out.print("Coders");
                }
                System.out.println();
            }else {
                System.out.println(i);
            }

        }





    }
}
