package SKuzmenko.week2;

public class Consecutive {
    public static void main(String[] args) {

        ConsecutiveNumb(24);

    }
    public static void ConsecutiveNumb(int num) {


        String Codility = "Codility";
        String Coders = "Coders";
        String Test = "Test";
        String result = "";

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                result = Codility + Test + " ";
            } else if (i % 2 == 0 && i % 5 == 0) {
                result = Test + Coders + " ";
            } else if (i % 3 == 0 && i % 5 == 0) {
                result = Codility + Coders + " ";
            } else if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                result = Codility + Test + Coders + " ";
            } else if (i % 2 == 0) {
                result = Codility + " ";
            } else if (i % 3 == 0) {
                result = Test + " ";
            } else if (i % 5 == 0) {
                result = Coders + " ";
            } else {
                result = i + " ";
            }
            System.out.println(result);
        }
    }
}
