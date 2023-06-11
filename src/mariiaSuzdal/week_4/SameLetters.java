package mariiaSuzdal.week_4;

import java.util.*;

public class SameLetters {
    public static void main(String[] args) {

        System.out.println(sameLetters("abc", "cab"));

    }

    public static boolean sameLetters(String str1, String str2) {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));
        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }
}
/*
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */