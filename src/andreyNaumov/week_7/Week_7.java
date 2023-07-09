package andreyNaumov.week_7;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Week_7 {


    //   1) Array - Find Minimum
    //Write a method that can find the minimum number from an int Array

    public static int minNumThruLoop(int[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException();
        }

        int result = arr[0];

        for (int num : arr) {
            if (num < result) {
                result = num;
            }
        }
        return result;
    }

    public static int minNumThruSort(int[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException();
        }

        Arrays.sort(arr);

        int result = arr[0];
        return result;
    }


    //    2) Array - Sort Ascending
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex:
    //            int[] arr = {10, 9, 8, 7};
    //             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
    //
    public static int[] sortAsc(int[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException();
        }
        List<Integer> list = new LinkedList<>();

        for (int each : arr) {
            if (list.size() == 0) {
                list.add(each);
                continue;
            }
            if (each >= list.get(list.size() - 1)) {
                list.add(each);
                continue;
            }
            if (each <= list.get(0)) {
                list.add(0, each);
                continue;
            } else {
                for (int i = 1; i < list.size(); i++) {
                    if (each <= list.get(i)) {
                        list.add(i, each);
                        break;
                    }
                }
            }
        }
        int[] result = list.stream().mapToInt(i -> i).toArray();
        return result;
    }





        //    3) Array - Sort Descending
        //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
        //Ex:  int[] arr = {10,20,7, 8, 90};
        //                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};


    public static int[] sortDes(int[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException();
        }
        List<Integer> list = new LinkedList<>();

        for (int each : arr) {
            if (list.size() == 0) {
                list.add(each);
                continue;
            }
            if (each <= list.get(list.size() - 1)) {
                list.add(each);
                continue;
            }
            if (each >= list.get(0)) {
                list.add(0, each);
                continue;
            } else {
                for (int i = 1; i < list.size(); i++) {
                    if (each >= list.get(i)) {
                        list.add(i, each);
                        break;
                    }
                }
            }
        }
        int[] result = list.stream().mapToInt(i -> i).toArray();
        return result;
    }






    public static void main(String[] args) {

        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10,-78,654,-5,-5,-34,-5,-634,56,-456,6398565,};
        long t1 = 0;
        long t2 = 0;

        System.out.println("-------------sortAsc------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("sortAsc(arr1) = " + Arrays.toString(sortAsc(arr1)));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();

        System.out.println("-------------minNumThruSort------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("minNumThruSort(arr1) = " + minNumThruSort(arr1));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();

        System.out.println("-------------sortDes------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("sortDes(arr1) = " + Arrays.toString(sortDes(arr1)));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();




    }

}
