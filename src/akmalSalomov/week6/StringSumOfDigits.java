package akmalSalomov.week6;

/*
Write a method that can return the sum of the digits in a string
 */
public class StringSumOfDigits {

    /*
    I looped through each character in the String with for loop. For each character I've checked if it is digit using
    isDigit method of the Character class. If the character is a digit, then it converts it to and integer using the
    getNumericValue method uf the Character class and adds it to the sum variable. In the end the method returns the sum
    of digits in the given String
     */
    ///

    public static int sumOfDigits(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum += Character.getNumericValue(ch);
            }
        }return sum;
    }

    public static void main(String[] args) {
        System.out.println("sumOfDigits(\"a3g4fj53dj5\") = " + sumOfDigits("a3g4fj53dj5")); // 20
    }
}
