package akmalSalomov.week5;

public class ReverseString {

    /*
    Write a return method that can reverse String
     */

    public static String reverseString(String str){

        // Define and empty String to store reversed str
        String reversed = "";

        // Loop through each character in the str String in reverse order
        for (int i = str.length()-1; i >=0 ; i--) {
            // Get the current character
            char currentChar = str.charAt(i);

            // Append the current character to the reversed String
            reversed += currentChar;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("java"));
    }
}
