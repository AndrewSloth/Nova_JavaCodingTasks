package christinaGerdzhikova.week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FrequencyOfChar {

    public static String frequencyOfChar(String word){

        char[] arr = word.toCharArray();

        String result = "";

        for (char each : arr) {
            int count = 0;
            for (char element : arr) {
                if (each == element){
                    count++;
                }
            }
            if (result.contains("" + each)){
                continue;
            }
            result += "" + each + count;
        }
        return result;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        System.out.println(frequencyOfChar(word));
    }
}
