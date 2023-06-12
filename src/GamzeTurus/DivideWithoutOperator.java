package GamzeTurus;

public class DivideWithoutOperator {

    public static int DivideTwoNumber(int number1, int number2){

        int count = 0;
        while( number1 >= number2){
            number1 -= number2;
            count = count + 1; // to know how many times that has been subtracted.
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(DivideTwoNumber(10, 4));
    }


}
