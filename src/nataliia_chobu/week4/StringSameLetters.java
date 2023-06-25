package nataliia_chobu.week4;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StringSameLetters {
    //    ➡️ String -- Same letters
//    Write a return method that check if a string is build out of the same letters as another string.
//    Ex: same("abc", "cab"); -> true
//    same("abc", "abb"); -> false:
    public static void main(String[] args) {
         System.out.println(ifTheSameLetters("lsd", "asd"));
          System.out.println(ifTheSameLetters("abc","cab"));
        System.out.println(theSameLetters("abc","cab"));

    }


    public static boolean ifTheSameLetters(String str, String str2) {

        String[] strArray = str.split("");
        Set<String> strTreeSet = new TreeSet<>(Arrays.asList(strArray));

        String[] str2Array = str2.split("");
        Set<String> str2TreeSet = new TreeSet<>(Arrays.asList(str2Array));

        if (strTreeSet.equals(str2TreeSet)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean theSameLetters(String str1, String str2) {

        char[] str1Array = str1.toCharArray();

        char[] str2Array = str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        if (Arrays.equals(str1Array,str2Array)) {
            return true;
        } else {
            return false;
        }


    }


}
