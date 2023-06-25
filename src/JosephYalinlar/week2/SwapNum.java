package JosephYalinlar.week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        while (true) {  //loops in order to ask the same question
            try {   //catch the invalid input, in this case !int
                System.out.println("Enter your first variable:");
                int firstVar = Scanner.nextInt();

                System.out.println("Enter your second variable: ");
                int secondVar = Scanner.nextInt();

                System.out.println("Your numbers: First " + firstVar + " Second " + secondVar + "\nNow your numbers will swap:");
                firstVar = firstVar + secondVar;
                secondVar = firstVar - secondVar;
                firstVar = firstVar - secondVar;
                System.out.println("First " + firstVar + " Second " + secondVar);
                break;
            } catch (InputMismatchException e) {    //error message
                System.err.println("Please enter a number");
                Scanner.next();

            }
        }
        Scanner.close();
    }
}
