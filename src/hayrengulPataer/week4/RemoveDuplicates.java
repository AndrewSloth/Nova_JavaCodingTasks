package hayrengulPataer.week4;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));
    }

    public static String removeDuplicates(String str) {
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains(str.charAt(i) + "")) {
                unique += str.charAt(i);
            }

        }
        return unique;
    }
}
/*
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC

 */
