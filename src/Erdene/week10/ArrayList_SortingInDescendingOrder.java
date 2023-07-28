package Erdene.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_SortingInDescendingOrder {

    // Creating public method to sort the list in desc order
    public static void sortingInDesc(ArrayList<Integer> list){
        //First we want to sort the list in asc order using sort method in Collections
        Collections.sort( list );
        //Then we want to reverse the order to sort numbers in descending order
        Collections.reverse(list);
        //Printing to see the order
        System.out.println("list = " + list);
    }

    public static void main(String[] args) {
        sortingInDesc(new ArrayList<>(Arrays.asList(1, 23, 13, 34, 11, 4, 143, 65)));

    }
}
