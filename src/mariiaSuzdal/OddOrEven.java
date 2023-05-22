package mariiaSuzdal;

public class OddOrEven {
    public static void main(String[] args) {
        evenOrOdd(5);
        evenOrOdd(6);
    }

    public static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

    }
}
/*
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
 */