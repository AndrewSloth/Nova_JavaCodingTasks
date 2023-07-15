package hayrengulPataer.week7;

public class FindMinimum {

    public static void main(String[] args) {
        int[] num = {5, 20, 35, 46, 52};

        System.out.println(minNum(num));
    }

    public static int minNum(int[] num) {


        int min = num[0]; //  assume that first element is the maximum number

        for (int i = 1; i < num.length; i++) { // i: 1, 2, 3, 4, 5
            if (num[i] < min) { // compeers the element of the array with current maximum number
                min = num[i]; // replace the current
            }
        }
        return min;


    }
}

/*
 1) Array - Find Minimum
Write a method that can find the minimum number from an int Array
 */
