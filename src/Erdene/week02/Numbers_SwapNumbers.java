package Erdene.week02;
/*
Given two variables, swap the values without using third variables.
 */
public class Numbers_SwapNumbers {
    public static void swapNumbers(int First, int Second){

        First = First + Second;       // adding two variables together to get first variables value assigned to second variable

        Second = First - Second;        // taking out second variables value to have first variable's value and assigning it to second variable

        First = First - Second;         // taking out new second variable which now has value of old first.

        System.out.println("After swapping " + "\n First: " + First + "\n Second: " + Second);
    }

    public static void main(String[] args) {
        swapNumbers(3, 34);
    }

}
