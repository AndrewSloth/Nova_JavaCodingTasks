package JosephYalinlar.week5;

/*
Write a return method that can reverse String
Synopsis:

*/

public class ReverseString {
    public static String reverseString(String string) {
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        String sting = "ABCD";
        System.out.println("reverseString(sting) = " + reverseString(sting));
    }
}