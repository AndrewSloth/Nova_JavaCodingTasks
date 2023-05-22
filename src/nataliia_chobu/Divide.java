package nataliia_chobu;

public class Divide {
    public static void main(String[] args) {
divideWithoutDivisionOperator(-12,5);

    }


    public static void divideWithoutDivisionOperator(int a,int b) {


        if(a<=0 || b<=0) {
            System.err.println("Zero and negative numbers are not accepted. Given dividend is \"" + a + "\", given divisor is \"" + b + "\".");
        }
        System.exit(0);
        int result = 0;
            while (a >= b) {

                a -= b;
                result++;
            }

        System.out.println(result);

        }
    }







