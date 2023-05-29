package AndreyNaumov.week_2;

public class util_week2 {


    public static void main(String[] args) {

        //swap num
        System.out.println("swap num");

        int x = 12, y = 11;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = y - x;
        y = y - x;
        x = y + x;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


        System.out.println("----------------------------------------------------------------------------");
        //divisible 3,5,15


        System.out.println("divisible 3,5,15");

        String div15 = "";
        String div3 = "";
        String div5 = "";

        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {
                div15 += i + " ";
                continue;
            }
            if (i % 5 == 0) {
                div5 += i + " ";
                continue;
            }
            if (i % 3 == 0) {
                div3 += i + " ";
            }
        }
        System.out.println(div15);
        System.out.println(div5);
        System.out.println(div3);

        System.out.println("----------------------------------------------------------------------------");


/*
numbers print consecutive numbers
given positive int N prints num from 1 to N each on a separate line
any num divisible by 2,3,5 should be replaced by Codility Test and Coders

 */


        int n = 75;

        for (int i = 1; i < n; i++) {

            String result = "";

            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                if (i % 2 == 0) {
                    result += "Codility";
                }
                if (i % 3 == 0) {
                    result += "Test";
                }
                if (i % 5 == 0) {
                    result += "Coders";
                }
            } else {
                result = "" + i;
            }

            System.out.println(result);


        }


    }


}
