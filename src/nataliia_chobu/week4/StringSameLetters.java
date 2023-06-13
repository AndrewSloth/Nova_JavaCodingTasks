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
}
