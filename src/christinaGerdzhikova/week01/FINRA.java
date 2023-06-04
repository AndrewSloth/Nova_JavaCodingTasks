package christinaGerdzhikova.week01;

import java.util.Scanner;

public class FINRA {

    public static void Finra (int num) {

        for (int i = 1; i <= num; i++) {
           if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("FIN");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("RA");
                continue;
            }


            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        Finra(num);

    }
}
/*Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
