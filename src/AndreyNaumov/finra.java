package AndreyNaumov;


/*
Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
public class finra {

    public static void finra() {
        for (int i = 1; i < 31; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }

        }
    }

    public static void finra1() {
        String result = "";
        for (int i = 1; i < 31; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += "FINRA ";
            } else if (i % 3 == 0) {
                result += "FIN ";
            } else if (i % 5 == 0) {
                result += "RA ";
            } else {
                result += i + " ";
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        finra();
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        finra1();

    }

}
