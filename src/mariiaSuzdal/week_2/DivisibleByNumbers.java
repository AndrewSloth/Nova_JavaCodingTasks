package mariiaSuzdal.week_2;

public class DivisibleByNumbers {
    public static void main(String[] args) {
        divisible();
    }

    public static void divisible() {

        String byFifty = "";
        String byFive = "";
        String byThree = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                byFifty += i + " ";
            } else if (i % 3 == 0) {
                byThree += i + " ";
            } else if (i % 5 == 0) {
                byFive += i + " ";
            }

        }

        System.out.println(byFifty);
        System.out.println(byThree);
        System.out.println(byFive);

    }

}
