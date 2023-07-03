package JosephYalinlar.week4;


import java.util.HashSet;
import java.util.Set;

/*
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC

 */
public class RemoveDuplicates {
    public String removeDuplicates(String string) {
        StringBuilder result = new StringBuilder();
        Set<Character> seenCharacters = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (!seenCharacters.contains(currentChar)) {
                result.append(currentChar);
                seenCharacters.add(currentChar);
            }
        }
        return result.toString();
    }

}

