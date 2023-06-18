package mariiaSuzdal.week_5;

import java.util.*;

public class FindUnique {
    public static void main(String[] args) {

        System.out.println(uniqueCh("AAABBBCCCDEF"));

    }

    //first solution
    public static String uniqueCh(String str) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        list.removeIf(p -> Collections.frequency(list, p) > 1);

        return String.valueOf(list);
    }
}
/*

Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

 */