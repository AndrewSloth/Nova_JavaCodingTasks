package Erdene.week02;

public class Numbers_SwapNumbers {
    public static void swapNumbers(int First, int Second){

        First = First + Second;

        Second = First - Second;

        First = First - Second;

        System.out.println("After swapping " + "\n First: " + First + "\n Second: " + Second);
    }


}
