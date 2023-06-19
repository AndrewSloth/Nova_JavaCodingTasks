package nataliia_chobu.week5;

import java.util.*;

public class UniqueElement {

    public static void main(String[] args) {
        System.out.println(findTheUnique("AAABBBCCCDEF"));
        System.out.println(uniqueElement("AAABBBCCCDEF"));
    }

    //    String -- Find the unique
//    Write a return  method that can find the unique characters from the String
//    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
    public static String findTheUnique(String str) {
        String result = "";

        String[] strArray = str.split("");
        ArrayList<String> strArrayList = new ArrayList<>(Arrays.asList(strArray));

        for (String eachChar : strArrayList) {
            int frequency = Collections.frequency(strArrayList, eachChar);
            if (frequency == 1) {
                result += eachChar;
            }
        }

        return result;
    }


    public static String uniqueElement(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            if (count == 1) {
                result += ch;
            }
        }
        return result;

    }





}
