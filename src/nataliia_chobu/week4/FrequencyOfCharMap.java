package nataliia_chobu.week4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharMap {
    public static void main(String[] args) {

        System.out.println(frequencyOfChar("aaaaavvvbbbmmmm"));
    }
    private static String frequencyOfChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int count=0;
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.replace(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        String result =map.toString().replace("{","").replace("=","").replace(", ","").replace("}","");



        return result;
    }
}
