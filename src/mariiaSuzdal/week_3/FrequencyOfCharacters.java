package mariiaSuzdal.week_3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(freqOfChar("AAABBCDDDD"));

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
}
/*
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2**
 */