package mariiaSuzdal.week_2;

public class SwapNumbers {
    public static void main(String[] args) {

        numbers(10, 5);


    }

    public static void numbers(int x, int y) {
        System.out.println("x base: " + x);
        System.out.println("y base: " + y);

        y = y + x; //15
        x = y - x; // 5
        y = y - x;

        System.out.println("x swap: " + x);
        System.out.println("y swap: " + y);
    }
}
