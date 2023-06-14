package GamzeTurus.week2;

public class SwapNumbers {

    public static void swapNumbers(int num1, int num2){

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("swapped" + "number 1: " + num1 + "number 2" + num2);
    }
}
