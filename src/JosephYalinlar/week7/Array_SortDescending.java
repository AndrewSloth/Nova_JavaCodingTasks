package JosephYalinlar.week7;

import java.util.Arrays;

/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};

 */
public class Array_SortDescending {
    public static int[] sortDescending(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temporaryNum = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temporaryNum;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        System.out.println(Arrays.toString(sortDescending(arr)));
    }
}
/*
*** to understand what nested loop does first understand what the most inner loop does ***
* static array method is created with int array parameter
* loop the array
* loop the array again without the sorted elements (which are in the end)
* swap elements if the element is smaller than next element
* return array
 */