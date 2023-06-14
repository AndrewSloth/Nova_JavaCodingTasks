package GamzeTurus.week2;

public class PrintConsecutiveNumbers {

    public static void main(String[] args) {
        consecutiveNum(24);
    }

    public static void consecutiveNum(int num){


        String codility = "Codility";
        String coders = "Coders";
        String test = "Test";
        String result = "";

        for (int i = 1; i <= num; i++){
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
    }


}
