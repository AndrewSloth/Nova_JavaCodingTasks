package mariiaSuzdal.week_4;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println(removeDuplicates1("AAABBBCCC"));
        System.out.println(removeDuplicates2("AAAFFFBBBAAACCDDCD"));

    }

    //firstSolution
    public static String removeDuplicates1(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    //secondSolution
    public static String removeDuplicates2(String str) {

        // ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        //Collections.sort(list);

        Set<String> set1 = new TreeSet<>(List.of(str.split("")));

        return set1.toString();
    }


}
/*
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC

 */