package nataliia_chobu.week7;

import java.util.Arrays;

public class DescendingSorting {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortedDescending(new int[]{-1, 2, 3, 5, 6, -9})));
        System.out.println(Arrays.toString(sortedDescending(new int[]{10,20,7, 8, 90})));
    }

    public static int[] sortedDescending(int[] nums) {
//    3) Array - Sort Descending
//Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
//Ex:int[] arr = {10,20,7, 8, 90};
//arr = Sort(arr);==>{90, 20, 10, 8, 7}
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}

