package nataliia_chobu.week7;

import java.util.Arrays;

public class AscendingSorting {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortedArray(new int[]{-1, 2, 3, 5, 6, -9})));
        //   2) Array - Sort Ascending
        //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        //Ex:
        //            int[] arr = {10, 9, 8, 7};
        //             arr = Sort(arr);         ==>{ 7, 8, 9, 10};


    }
public static int[] sortedArray( int[] nums){

    int temp=0;

        for (int i = 0; i < nums.length; i++) {
        for (int j = i+1; j < nums.length; j++) {
            if(nums[i] > nums[j]) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
        return nums;
}
}