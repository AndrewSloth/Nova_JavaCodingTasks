package christinaGerdzhikova.week04;

public class RemoveDuplicates {

    //String -- Remove Duplicates
    //Write a return method that can remove the duplicated values from String
    //Ex: removeDup("AAABBBCCC") ==> ABC

    public static String removeDuplicatesMethod(String word){

        String result = "";

        for (int i = 0; i < word.length(); i++) {

            if (result.contains("" + word.charAt(i))){
                continue;
            }else {
                result += word.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String word = "AAABBBCCC";

        System.out.println("removeDuplicatesMethod(word) = " + removeDuplicatesMethod(word));
    }

}
