package AndrewBalint.week5;

import java.util.ArrayList;
import java.util.List;

public class Week5Utility {

    public static void main(String[] args) {

        System.out.println(returnUniqueCharsVersion1("ABBBCCCDEFAF1 1 1 23"));
        System.out.println(returnUniqueCharsVersion2("ABBBCCCDEFAF1 1 1 23"));
        System.out.println(reverseStringVersion1("stunod ekil I"));
        System.out.println(reverseStringVersion2("nuf si avaJ"));
        System.out.println(reverseStringVersion3("noitanetacnoc oN"));
    }

    /*
    3.String -- Find the unique
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */
    public static String returnUniqueCharsVersion1(String str){

        //The resulting String with unique chars
        String uniqueChars ="";

        //iterate through each character
        for(char each : str.toCharArray()){

            //How many times the character has appeared
            int count = 0;

            //iterate through the string a second time and see how many times the character reappears
            for (char dupeCheck: str.toCharArray()) {

                //Increase count each time the character is encountered
                if(dupeCheck==each){
                    count++;
                }
            }

            //If char is only found once it is unique and we add to the result String
            if(count==1){
                uniqueChars+=""+each;
            }

        }

        return uniqueChars;
    }


    public static String returnUniqueCharsVersion2(String str){

        //The resulting String with unique chars
        List<String> uniqueChars = new ArrayList<>();

        //iterate through each character
        for(int i = 0; i<str.length();i++){

            //How many times the character has appeared
            int count = 0;

            //iterate through the string a second time and see how many times the character reappears
            for (char dupeCheck: str.toCharArray()) {

                //Increase count each time the character is encountered
                if(dupeCheck==str.charAt(i)){
                    count++;
                }
            }

            //If char is only found once it is unique and we add to the result String
            if(count==1){
                uniqueChars.add(""+str.charAt(i));
            }

        }


        return String.join("", uniqueChars);
    }



    /*
    4) String - Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */

    //This version uses StringBuilder
    public static String reverseStringVersion1(String str){

        return new StringBuilder(str).reverse().toString();
    }

    //This version iterates through the String
    public static String reverseStringVersion2(String str){

        String reversed = "";

        //Iterate through String in reverse and append each char to new String
        for(int i = str.length()-1; i>=0; i--){
            reversed+=""+str.charAt(i);
        }

        return reversed;
    }

    //This version does not concatenate the String inside of the loop
    public static String reverseStringVersion3(String str){

        char[] reversed = new char[str.length()];

        for(int i = str.length()-1; i>=0;i--){
            reversed[str.length()-1-i] = str.charAt(i);
        }



        return new String(reversed);
    }

}
