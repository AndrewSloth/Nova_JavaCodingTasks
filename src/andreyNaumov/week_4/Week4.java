package andreyNaumov.week_4;

import java.util.*;

public class Week4 {


    /**
     * String -- Remove Duplicates
     * Write a return method that can remove the duplicated values from String
     * Ex: removeDup("AAABBBCCC") ==> ABC
     *
     * @param str
     * @return
     */
    public static String removeDup1(String str) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList(str.split("")));
        String result = "";
        for (String each : set) {
            result += each;
        }
        return result;
    }

    public static String removeDup2(String str) {
        Set<Character> set = new LinkedHashSet<>();
        char[] arr1 = str.toCharArray();
        String result = "";
        for (char each : arr1) {
            if (set.add(each)) {
                result += "" + each;
            }
        }
        return result;
    }


    public static String removeDuplicatesV1(String str) {

        if (str == null || str.isEmpty()) {
            // or throw IllegalArgumentException
            return "";
        }

        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chArray) {
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }

        }
        return sb.toString();
    }

    public static String removeDuplicatesV2(String str) {

        if (str == null || str.isEmpty()) {
            // or throw IllegalArgumentException
            return "";
        }

        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> chHashSet = new HashSet<>();
        for (char c : chArray) {
            if (chHashSet.add(c)) {
                sb.append(c);
            }

        }
        return sb.toString();
    }


    /**
     * String -- Same letters
     * Write a return method that check if a string is build out of the same letters as another string.
     * Ex: same("abc", "cab"); -> true
     * same("abc", "abb"); -> false:
     *
     * @param str1,str2
     */
    public static boolean same(String str1, String str2) {
        if (str1.length() == str2.length()) {
            char[] arr1 = str1.toCharArray();
            Arrays.sort(arr1);
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr2);
            if (arr1.equals(arr2)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    public static boolean same1(String str1, String str2) {
        if (str1.length() == str2.length()) {
            List<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
            Collections.sort(list1);
            List<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));
            Collections.sort(list2);
            if (list1.equals(list2)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    // 10000 simbols
    public static String test1 = "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";
    // 10000 simbols
    public static String test2 = "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";
    public static String test3 = "qw!edsa";
    public static String test4 = "asd qwe";


    public static void main(String[] args) {
        long t1 = 0;
        long t2 = 0;

        System.out.println("-------------removeDup1------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println(removeDup1(test1));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();


        System.out.println("-------------removeDup2------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println(removeDup2(test1));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();
        System.out.println("-------------removeDuplicatesV1------------------------------");

        t1 = System.currentTimeMillis();
        System.out.println(removeDuplicatesV1(test1));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();

        System.out.println("-------------removeDuplicatesV2------------------------------");

        t1 = System.currentTimeMillis();
        System.out.println(removeDuplicatesV2(test1));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();


        System.out.println("------------------same-------------------------");
        t1 = System.currentTimeMillis();
        System.out.println(same(test1, test2));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();


        System.out.println("-------------------same1------------------------");
        t1 = System.currentTimeMillis();
        System.out.println(same1(test1, test2));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();

    }
}
