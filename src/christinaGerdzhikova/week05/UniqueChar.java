package christinaGerdzhikova.week05;

public class UniqueChar {

    //3.String -- Find the unique
    //Write a return  method that can find the unique characters from the String
    //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

    public static String uniqueChar(String word){
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)){
                    count++;
                }
            }
            if (count == 1) {
                result += word.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String word = "AAABBBCCCDEF";

        System.out.println("uniqueChar(word) = " + uniqueChar(word));
    }
}
