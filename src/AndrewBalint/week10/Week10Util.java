package AndrewBalint.week10;

import java.util.*;

public class Week10Util {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(4,2,5,6,7,3,1,67,56,3,5));
        sortArrayListAsc(list);

        System.out.println(list);
       // sortArrayListDesc(list);
       // System.out.println(list);

        /*Map<Integer, Integer> map = new LinkedHashMap<>();

        map.put(1,89);
        map.put(2,5);
        map.put(3,9);
        map.put(4,896);
        map.put(5,98);

        sortMapValuesAsc(map);
        System.out.println(map);*/
    }

/*
ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method.
*/

    public static void sortArrayListAsc(List<Integer> list){

        for(int i = 0; i< list.size(); i++){ //Iterate through the list
            for(int j = 0; j<list.size()-1;j++){ //Go through the list and compare each value
                                                //to the value on the right

                //Outer Loop
                //(100, 102, 5, 8, 10, 100) ORIGINAL Values

                    //Inner Loop
                    //(100, 102, 5, 8, 10) Inner loop step 1
                    //(100, 5, 102, 8, 10)
                    //...
                    //(100, 5, 8, 10, 102)

                //(100, 5, 8, 10, 102)

                //If value on the left is greater...
                if(list.get(j)>list.get(j+1)){
                    //Swap the values
                    Integer temp = list.get(j); //Use temporary variable to swap value places
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }

            }
        }

    }

/*
ArrayList - sorting in descending order
Write a method that can sort the ArrayList in Descending order without using the sort method.
*/
    public static void sortArrayListDesc(List<Integer> list){

        for(int i = 0; i< list.size(); i++){
            for(int j = 0; j<list.size()-1;j++){

                //Bubble sort
                if(list.get(j)<list.get(j+1)){
                    Integer temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }

            }
        }

    }

    /*
Map - Sort the map by values
Write a method that can sort the Map by values.
 */
    public static void sortMapValuesAsc(Map<Integer, Integer> map){

        for(int i = 1; i<= map.size(); i++){
            for(int j = 1; j<=map.size()-1;j++){

                //Bubble sort
                if(map.get(j)>map.get(j+1)){

                    Integer temp = map.get(j);
                    map.put(j, map.get(j+1));
                    map.put(j+1, temp);
                }

            }
        }
        
    }
}
