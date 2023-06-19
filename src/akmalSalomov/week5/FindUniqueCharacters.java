package akmalSalomov.week5;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindUniqueCharacters {
    /*
    Write a return method that can find the unique characters from String
     */
    public static void main(String[] args) {


        String str = "aabcccdeeeef";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            if(frequency == 1) {
                map.put(each.charAt(0), frequency);
            }
        }
        System.out.println(map); // {b=1, d=1, f=1}
    }

}
