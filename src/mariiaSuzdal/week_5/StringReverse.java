package mariiaSuzdal.week_5;

public class StringReverse {

    public static void main(String[] args) {

        System.out.println(stringReverse("ABCD"));

    }


    public static String stringReverse(String str) {

        String newString = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            newString += str.charAt(i);

        }

        return newString;

    }


}
/*

Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA

 */