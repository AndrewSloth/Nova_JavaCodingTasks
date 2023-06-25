package JosephYalinlar.week1;

public class Finra {
    public static void printFinra() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i + " ");
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.print("FIN ");
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.print("RA ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            }

        }
    }


    public static void printFinra2() {
        for (int j = 1; j <= 30; j++) {
            if (j % 3 == 0 || j % 5 == 0) {
                if (j % 3 != 0) {
                    System.out.print("RA ");
                } else if (j % 5 != 0) {
                    System.out.print("FIN ");

                } else {
                    System.out.print("FINRA ");
                }
            } else {
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Non-Nested If FINRA");
        printFinra();
        System.out.println("\nNested If FINRA");
        printFinra2();
    }
}
