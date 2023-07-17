package mariiaSuzdal.week_9;

import java.util.Arrays;

public class Array_concat2Arrays {
    public static void main(String[] args) {
        int[] list1 = new int[]{10, 20, 30};
        int[] list2 = new int[]{40, 50, 60};
        int[] result = twoArr(list1, list2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoArr(int[] list1, int[] list2) {
//i created a new int where I store the length of the list 1 array
        int count1 = list1.length;
//i created a new int where I store the length of the list 2 array
        int count2 = list2.length;
//i created a new array where I assign a new length -> sum of length of two arrays
        int[] newList = new int[count1 + count2];
// i created a for loop that will work during the length of list1
        for (int i = 0; i < count1; i++) {
// i added to the new empty array the value of the list 1
            newList[i] = list1[i];
        }

        for (int i = 0; i < count2; i++) {
// i added to the new array the value of the list 2, but I started not from the 0 I started after length count1 + 1
            newList[count1 + i] = list2[i];
        }

        return newList;
    }
}
/*
Write a return method that can concatenate two arrays
 */