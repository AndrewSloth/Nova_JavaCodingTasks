package andreyNaumov.week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week_9 {

    public static void main(String[] args) {

        String[] arr1 = new String[]{"1", "2", "3", "4", "5", "6", "7", "8"};
        String[] arr2 = new String[]{"9", "10", "11", "12", "13", "14", "15", "16"};
        List<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron", "Ahmed", "John", "Eric", "Ahmed", "Aaron"));
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3,546,22,49,99,100, 4, 5, 6, 101, 200, 300,-500,500,654,8,2,48, 0,5851));
        long t1 = 0;
        long t2 = 0;

        System.out.println("-------------concat2Arrays------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("sortAsc(arr1, arr2) = " + Arrays.toString(concat2Arrays(arr1, arr2)));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();

        System.out.println("-------------concat2ArraysWithLoop------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("concat2ArraysWithLoop(arr1, arr2) = " + Arrays.toString(concat2ArraysWithLoop(arr1, arr2)));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();

        System.out.println("-------------removeNameAhmed------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("removeNameAhmed(list) = " + removeNameAhmed(list));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();

        System.out.println("-------------removeSomeValues------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("removeSomeValues(intList) = " + removeSomeValues(intList));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();

    }


    //1️⃣  Array_concat2Arrays
    //Write a return method that can concatenate two arrays

    public static String[] concat2Arrays(String[] arr1, String[] arr2) {

        if (arr1.length < 1 || arr2.length < 1) {
            throw new IllegalArgumentException();
        }
        String[] arrResult = new String[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arrResult, 0, arr1.length);
        System.arraycopy(arr2, 0, arrResult, arr1.length, arr2.length);

        return arrResult;
    }

    public static String[] concat2ArraysWithLoop(String[] arr1, String[] arr2) {

        if (arr1.length < 1 || arr2.length < 1) {
            throw new IllegalArgumentException();
        }

        String[] arrResult = new String[arr1.length + arr2.length];
        int index = 0;

        for (String s : arr1) {
            arrResult[index] = s;
            index++;
        }
        for (String s : arr2) {
            arrResult[index] = s;
            index++;
        }

        return arrResult;
    }


    //2️⃣  List_RemoveNameAhmed
    //Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
    //Write a java operation to remove all the names named Ahmed
    public static List<String> removeNameAhmed(List<String> list) {

        list.removeIf(p -> p.equals("Ahmed"));

        return list;
    }


    //3️⃣ List_RemoveSomeValues
    //Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
    public static List<Integer> removeSomeValues(List<Integer> list) {

        list.removeIf(p -> p > 100);

        return list;
    }

}

