package JosephYalinlar.week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsecutiveNums {


    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the amount of numbers you'd like to print consecutively: ");
                int n = Scanner.nextInt();
                printConsecutiveNums(n);
                break;
            } catch (InputMismatchException e) {
                System.err.println("Please enter only numbers");
                Scanner.next();
            }
        }
        Scanner.close();
    }

    public static void printConsecutiveNums(int n) {

        String codility = "Codility";
        String test = "Test";
        String coders = "Coders";

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                if (i % 2 == 0) {
                    System.out.print(codility);
                }
                if (i % 3 == 0) {
                    System.out.print(test);
                }
                if (i % 5 == 0) {
                    System.out.print(coders);
                }
            } else {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
