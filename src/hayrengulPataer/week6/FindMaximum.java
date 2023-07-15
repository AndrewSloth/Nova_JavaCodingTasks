package hayrengulPataer.week6;

public class FindMaximum {

    public static void main(String[] args) {
        int[] num = {5, 20, 35, 46, 52};

        System.out.println(maxNum(num));
    }

    public static int maxNum(int[] num) {


        int max = num[0]; //  assume that first element is the maximum number

        for (int i = 1; i < num.length; i++) { // i: 1, 2, 3, 4, 5
            if (num[i] > max) { // compeers the element of the array with current maximum number
                max = num[i]; // replace the current
            }
        }
        return max;


    }
}

/*
    3) Array - Find Maximum
Write a method that can find the maximum number from an int Array
 */
