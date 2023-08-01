package nataliia_chobu.week8;

import java.util.Arrays;

public class Array_MoveZerosToTheEnd {
    //    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
//input:  {1,0,2,0,3,0,4,0};
//output: [1, 2, 3, 4, 0, 0, 0, 0]
    public static void main(String[] args) {
        int[] arr = {11, 0, 12, 0, 13, 0, 14, 0};
        int a=10;
        int b=5;
        a=a+b;//15
        b=a-b;
        a=a-b;
        System.out.println(" a "+ a+" b "+b);

      //  System.out.println(Arrays.toString(moveZeroToEndOneLoop(arr)));
      //  System.out.println(Arrays.toString(moveZeroToEnd(new int[]{0, 0, -1, 1, 0, 2, 0, -9, 3, 0, 0, 4})));
    }
    public static int[] moveZeroToEndOneLoop(int[] arr){
        int nonZeroIndex = 0;
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If the element is non-zero, swap it with the element at nonZeroIndex
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
        return arr;
    }

    public static int[] moveZeroToEnd(int[] nums) {

        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0) {//if i equals 0, swap the numbers.
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }

}
