/*
This class has the purpose of testing out the functions of week 3
 */
package JosephYalinlar.week3;
import java.util.Scanner;
public class week3Test {
    public static void main(String[] args) {
        PrimeNum PrimeNum = new PrimeNum();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to see if your number if it's a prime number");
        int num = scanner.nextInt();
        System.out.println("Is your number a prime number? >" + PrimeNum.checkPrimeNum(num));
//-----------------------------------------------------------------------
        ReverseNegativeNum RevNegNum = new ReverseNegativeNum();
        System.out.println("Please enter your negative number to be reversed");
        int num2 = scanner.nextInt();
        System.out.println("Your new num is " + RevNegNum.reverseNegativeNum(num2));
//-----------------------------------------------------------------------

    }
}
