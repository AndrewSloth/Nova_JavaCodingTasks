package nataliia_chobu.week1;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(OddOrEven(1));
    }

    public static String OddOrEven(int a) {
        if (a % 2 == 0) {
            return  "Even";
        } else {
            return  "Odd";
        }

    }
/*
                Write  a method which can identify given number is even or odd
            Output ex:
            identify(5); ->"Odd"
            identify(6); ->"Even"
         */
}
