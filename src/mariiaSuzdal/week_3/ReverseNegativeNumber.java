package mariiaSuzdal.week_3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(number(-100));
    }

    public static int number(int num) {

        int numberReturn = 0;

        if (num < 0) {
            numberReturn -= num;
        } else {
            System.out.println("You should try with negative number");
            System.exit(1);
            // numberReturn += num;
        }
        return numberReturn;

    }
}
/*
Write a return method that can reverse negative number and return it as int
 */