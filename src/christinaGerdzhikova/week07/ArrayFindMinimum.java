package christinaGerdzhikova.week07;

public class ArrayFindMinimum {

    //1) Array - Find Minimum
    //Write a method that can find the minimum number from an int Array

    public static int findMinimum(int[] arr){
        int min = 2147483647;

        for (int each : arr) {

            if (each < min){
                min = each;
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 8, 12, 54, 8, 200, -150};

        System.out.println(findMinimum(arr));

    }
}
