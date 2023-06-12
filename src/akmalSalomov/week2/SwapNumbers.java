package akmalSalomov.week2;

public class SwapNumbers {
    public static void main(String[] args) {

        int x = 10, y = 15;
        x = x - y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
