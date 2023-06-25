package akmalSalomov.week4;

public class RemoveDuplicate {

    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (result.indexOf(chr) < 0) {
                result += chr;
            }
        }return result;
        /*
        So in this method takes String as input and returns modified String with all duplicates removed.
        We created and empty String 'result' and looped through each character in str. For each character
        we checked if it is already present in the 'result' String using indexOf method. If it is not present
        it adds it to the result String. This makes sure that only first appearance of each char is added to
        result, and it returns the result with all duplicates removed.

         */
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("aabb1cklmddlkkobr")); // ab1cklmdor
    }
}
