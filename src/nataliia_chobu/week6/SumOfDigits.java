package nataliia_chobu.week6;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("1234"));
    }
//    String - sum of digits in a string
//    Write a method that can return the sum of the digits in a string

    public static int sumOfDigits(String str) {
        int result = 0;
        str.length();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result += Integer.parseInt(String.valueOf(ch));
        }
//      String[] strArray = str.split("");
//       for(String eachChar:strArray){
//          result+=Integer.parseInt(eachChar);
//       }

        return result;
    }
}
