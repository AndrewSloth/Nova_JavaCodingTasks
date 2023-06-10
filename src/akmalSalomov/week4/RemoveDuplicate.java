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
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("aabb1cklmddlkkobr")); // ab1cklmdor
    }
}
