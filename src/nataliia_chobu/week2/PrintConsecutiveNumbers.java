package nataliia_chobu.week2;

public class PrintConsecutiveNumbers {
    public static void main(String[] args) {
        consecutiveNumber(24);
    }

    public static void consecutiveNumber(int n) {

        String result = "";
        String two = "Codility";
        String three = "Test";
        String five = "Coders";

        for (int i = 1; i < n; i++) {

            if (i % 5 == 0 && i % 3 == 0 && i % 2 == 0) {
                result = two + three + five;
            } else if (i % 2 == 0 && i % 3 == 0) {
                result = two + three;
            } else if (i % 2 == 0 && i % 5 == 0) {
                result = two + five;
            } else if (i % 3 == 0 && i % 5 == 0) {
                result = three + five;
            } else if (i % 2 == 0) {
                result = two;
            } else if (i % 3 == 0) {
                result = three;
            } else if (i % 5 == 0) {
                result = five;
            } else {
                result = " " + i;
            }
            System.out.println(result);
        }


    }
}
