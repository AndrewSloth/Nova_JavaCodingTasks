package mariiaSuzdal.week_2;

public class PrintNumbers {
    public static void main(String[] args) {

        numbers(24);
    }

    public static void numbers(int num) {

        String codility = "Codility";
        String test = "Test";
        String coders = "Coders";
        String result = "";

        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                result = codility + test + " ";
            } else if (i % 2 == 0 && i % 5 == 0) {
                result = test + coders + " ";
            } else if (i % 3 == 0 && i % 5 == 0) {
                result = codility + coders + " ";
            } else if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                result = codility + test + coders + " ";
            } else if (i % 2 == 0) {
                result = codility + " ";
            } else if (i % 3 == 0) {
                result = test + " ";
            } else if (i % 5 == 0) {
                result = coders + " ";
            } else {
                result = i + " ";
            }
            System.out.println(result);
        }
        // System.out.println(result);
    }
}
