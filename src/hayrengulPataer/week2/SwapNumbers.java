package hayrengulPataer.week2;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}