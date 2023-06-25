package andreyNaumov.week_5;

import java.util.*;

public class Week_5 {
    // 10000 simbols
    public static String str = "cKGbC7E13n@bg7EUrpfGCaQ!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";
    // public static String str = "nuuuuudsukdddddulllll";

    public static void main(String[] args) {
        long t1 = 0;
        long t2 = 0;


        System.out.println("-------------uniqThruMap------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("uniq(str) = " + uniqThruMap(str));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();

        System.out.println("-------------uniqThruIndex------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("uniq(str) = " + uniqThruIndex(str));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();

        System.out.println("-------------uniqThruIndexStringBuilder------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("uniq(str) = " + uniqThruIndexStringBuilder(str));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();


        System.out.println("-------------reversThruString------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("uniq(str) = " + reversThruString(str));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();

        System.out.println("-------------reversThruStringBuilder------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("uniq(str) = " + reversThruStringBuilder(str));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();


    }

    //3.String -- Find the unique
    //Write a return  method that can find the unique characters from the String
    //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
    public static String uniqThruMap(String word) {
        if (word.isEmpty() || word.isBlank()) {
            throw new IllegalArgumentException("String isEmpty or Blank !!!!");
        }

        String str = "";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            Character ch = word.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, (map.get(ch) + 1));
            } else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> each : map.entrySet()) {
            if (each.getValue() == 1) {
                str += "" + each.getKey();
            }
        }


        return str;
    }

    public static String uniqThruIndex(String word) {
        if (word.isEmpty() || word.isBlank()) {
            throw new IllegalArgumentException("String isEmpty or Blank !!!!");
        }

        String result = "";
        while (!word.equals("")) {
            if (0 == word.lastIndexOf(word.charAt(0))) {
                result += word.charAt(0);
                word = word.replaceAll(word.substring(0, 1), "");
            } else {
                word = word.replaceAll(word.substring(0, 1), "");
            }
        }

        return result;
    }

    public static String uniqThruIndexStringBuilder(String word) {
        if (word.isEmpty() || word.isBlank()) {
            throw new IllegalArgumentException("String isEmpty or Blank !!!!");
        }
        char[] arr1 = word.toCharArray();
        Arrays.sort(arr1);

        String word1 = new String(arr1);

        StringBuilder str = new StringBuilder(word1);
        StringBuilder res = new StringBuilder("");

        while (str.length() > 0) {
            if (0 == str.lastIndexOf("" + str.charAt(0))) {
                res.append(str.charAt(0));
                str.deleteCharAt(0);
            } else {
                char ch = str.charAt(0);
                str.delete(0, str.lastIndexOf("" + ch) + 1);

            }
        }

        return res.toString();
    }


    //4) String - Reverse
    //Write a return method that can reverse String
    //Ex: Reverse("ABCD"); ==> DCBA
    public static String reversThruStringBuilder(String word) {
        if (word.isEmpty() || word.isBlank()) {
            throw new IllegalArgumentException("String isEmpty or Blank !!!!");
        }
        StringBuilder str1 = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            str1.append(word.charAt(i));
        }
        String rev = str1.toString();
        return rev;
    }

    public static String reversThruString(String word) {
        if (word.isEmpty() || word.isBlank()) {
            throw new IllegalArgumentException("String isEmpty or Blank !!!!");
        }
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += "" + word.charAt(i);
        }
        return result;
    }


}
