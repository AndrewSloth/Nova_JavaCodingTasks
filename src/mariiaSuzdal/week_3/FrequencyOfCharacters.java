package mariiaSuzdal.week_3;


import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        System.out.println(freqOfChar("AAABBCDDDD"));

        System.out.println(freqOfChar2("AAABBCDDDD"));

    }

    public static String freqOfChar(String characters) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(characters.split("")));

        String answer = "";

        for (String each : list) {
            int frequency = Collections.frequency(list, each);

            if (!(answer.contains(each))) {
                answer += each + frequency;
            }
        }

        return answer;
    }

    public static Map freqOfChar2(String char2) {

        Map<Character, Integer> map = new HashMap<>();


        for (int i = 0; i <= char2.length() - 1; i++) {

            if (map.containsKey(char2.charAt(i))) {
                map.replace(char2.charAt(i), map.get(char2.charAt(i)) + 1);

            } else {
                map.put(char2.charAt(i), 1);
            }

        }
        return map;

    }
}
/*
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2**
 */