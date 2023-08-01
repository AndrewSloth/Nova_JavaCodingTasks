package nataliia_chobu.week10;

import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> mapList = new HashMap<>();
        mapList.put("orange", 4);
        mapList.put("banana", 3);
        mapList.put("watermelon", 1);
        mapList.put("apples", 8);
        mapList.put("mangoes", 5);
        System.out.println(sortMap(mapList));

    }
    //Write a method that can sort the Map by values.

    public static Map<String, Integer> sortMap(Map<String, Integer> inputMap) {
        List<Map.Entry<String, Integer>> outputList = new ArrayList<>(inputMap.entrySet());

        int n = outputList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Map.Entry<String, Integer> entryCurrent = outputList.get(j);
                Integer valCurrent = entryCurrent.getValue();
                Map.Entry<String, Integer> entryNext = outputList.get(j + 1);
                Integer valNext = entryNext.getValue();

                // If the value is bigger than the next one, swap the entries
                if (valCurrent > valNext) {
                    outputList.set(j, entryNext);
                    outputList.set(j + 1, entryCurrent);
                }
            }
        }

        // Create a new LinkedHashMap to hold the sorted entries
        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        // Add the sorted entries to the new map
        for (Map.Entry<String, Integer> entry : outputList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }


}







