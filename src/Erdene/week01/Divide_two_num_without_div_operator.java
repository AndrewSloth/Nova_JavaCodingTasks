package Erdene.week01;

public class Divide_two_num_without_div_operator {
    public static void Divide(double Dividend, double divisor) {
        int count = 1;
        double div = Dividend;

        try {
            if (divisor == 0 || Dividend < 0 || divisor > Dividend) {
                throw new Exception("Can't divide number by ZERO, or number that's smaller than Dividend, or divide negative number with this method");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        while(Dividend > divisor){
            Dividend -= divisor;
            count ++;
        }
        System.out.println(div + " / " + divisor + " = "+ count);

    }

}
