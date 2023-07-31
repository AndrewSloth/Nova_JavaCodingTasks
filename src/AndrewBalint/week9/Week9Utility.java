package AndrewBalint.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week9Utility {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Array_concat2Arrays(new int[]{1,2,3,4,5,6,6}, new int[]{4,6,3,5,6,6,7})));

        //List<Integer> emptyList = null;

        List<String> list = new ArrayList<>();
        list.add("Ahmed");
        list.add("Larry");
        list.add("ahmed");
        list.add("AhMeD");
        list.add("George");
        list.add("Cream E Biggums");

        List_RemoveSomeValues(list);

        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(50);
        list2.add(99);
        list2.add(101);

        removeGreaterThan100(list2);
        System.out.println(list2);
    }

    /*
    Array_concat2Arrays
Write a return method that can concatenate two arrays
*/

    //First for objects
    public static Object[] Array_concat2Arrays(Object[] array1, Object[] array2){

        //create new array the length of both arrays to be concatenated
        Object[] result = new Object[array1.length+ array2.length];

        //add the first array
        for(int i =0; i<array1.length;i++){
            result[i]=array1[i];
        }

        //Add the second array, with two separate indexes, adjusting for the position of the second array
        for (int i = array1.length, j=0; i < result.length; i++, j++) {
            result[i]=array2[j];
        }

        return result;

    }

    //Second for integers
    public static int[] Array_concat2Arrays(int[] array1, int[] array2){

        //create new array the length of both arrays to be concatenated
        int[] result = new int[array1.length+ array2.length];

        //add the first array
        for(int i =0; i<array1.length;i++){
            result[i]=array1[i];
        }

        //Add the second array, with two separate indexes, adjusting for the position of the second array
        for (int i = array1.length, j=0; i < result.length; i++, j++) {
            result[i]=array2[j];
        }

        return result;

    }

    /*
  List_RemoveSomeValues
Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
Write a java operation to remove all the names named Ahmed*/

    public static void List_RemoveSomeValues(List<String> list){

        if(list!=null){ //Remove if list is not null
            list.removeIf(each -> each.equalsIgnoreCase("ahmed"));
        }


    }

    /*



 List_RemoveSomeValues
Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
     */

    public static void removeGreaterThan100(List<Integer> list){
        if(list!=null) { //Remove if list is not null
            list.removeIf(n -> n > 100);
        }
    }
}
