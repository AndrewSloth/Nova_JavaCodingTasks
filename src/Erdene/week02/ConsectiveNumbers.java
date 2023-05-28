package Erdene.week02;

public class ConsectiveNumbers {
    public static void consecNumber(int N ){

        for (int i = 1; i < N; i++) {

            String res = "";

            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                if (i % 2 == 0) {
                    res += "Codility";
                }
                if (i % 3 == 0) {
                    res += "Test";
                }
                if (i % 5 == 0) {
                    res += "Coders";
                }
            } else {
                res = "" + i;
            }

            System.out.println(res);

             }

        }
}
