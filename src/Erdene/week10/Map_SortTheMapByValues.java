package Erdene.week10;

import java.text.CollationElementIterator;
import java.util.*;
import java.util.stream.Collectors;

public class Map_SortTheMapByValues {

    /*
            Write a method that can sort the Map by values.
     */


    //Creating public method to sort the map
    public static void sortByValue(Map<String, Integer> unsortedMap) {
        //Creating lists to store keys and values
        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<String> keys = new ArrayList<>();

        //iterate through map to store each keys and values in corresponding lists using lambda
        unsortedMap.forEach( (k, v) -> {
            values.add(v);
            keys.add(k);
        }  );
        //sorting the keys and values
        Collections.sort(values);
        Collections.sort(keys);
        //Creating LinkedHashMap to store keys and values in order.
        Map<String, Integer> sortedMap = new LinkedHashMap<>(Map.of());
        //Iterating through keys and values lists to put keys and values to Linked map
        for (int i = 0, k = 0; i <keys.size() ; i++, k++) {
            sortedMap.put(keys.get(i), values.get(k));

        }
        //Printing
        System.out.println("sortedMap = " + sortedMap);


    }

    public static void main(String[] args) {
        sortByValue(Map.of("D", 4, "A", 1, "C", 3, "B", 2));

    }
}
