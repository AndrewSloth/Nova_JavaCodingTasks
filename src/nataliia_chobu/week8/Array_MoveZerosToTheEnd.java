package nataliia_chobu.week8;

import java.util.Arrays;

public class Array_MoveZerosToTheEnd {
    //    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
//input:  {1,0,2,0,3,0,4,0};
//output: [1, 2, 3, 4, 0, 0, 0, 0]
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroToEnd(new int[]{0, 0, -1, 1, 0, 2, 0, -9, 3, 0, 0, 4})));
    }

    public static int[] moveZeroToEnd(int[] nums) {

        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}
