package JosephYalinlar.week5;

import java.util.HashMap;

//Write a return  method that can find the unique characters from the String
public class FindTheUnique {
    public static String findUnique(String string) {
        String unique = "";
        HashMap<Character, Integer> eachChar = new HashMap<>();
        for (char c : string.toCharArray()) {
            eachChar.put(c, eachChar.getOrDefault(c, 0) + 1);
        }
        for (char c : eachChar.keySet()) {
            if (eachChar.get(c) == 1) {
                unique += c;
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        String string = "AAABBBCCCDEF";
        System.out.println("findUnique(string) = " + findUnique(string));
    }
}