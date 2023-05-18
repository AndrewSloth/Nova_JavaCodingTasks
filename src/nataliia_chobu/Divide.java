package nataliia_chobu;

public class Divide {
    public static void main(String[] args) {
        System.out.println(divideWithoutDivisionOperator(12,3));
    }

    public static int divideWithoutDivisionOperator(int a, int b) {

        int result = 0;

        while (a >= b) {

            a -= b;
            result++;
        }

        return result;

    }
}
