package Erdene.week06;

public class String_sum_of_digits_in_String {

    //  2) String - sum of digits in a string
    //Write a method that can return the sum of the digits in a string

    public static void sum_of_digits_in_string(String str){
        // Creating int to store sum of digits
        int sum = 0;

        //Iterate through each letter and see if its between 0 and 9
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){

                //if the letter is between 0 and 9, we take its Integer value and add onto sum
                sum += Integer.parseInt(str.charAt(i)+"");
            }
        }

        System.out.println(sum);

    }

    public static void main(String[] args) {
        sum_of_digits_in_string("432");
        sum_of_digits_in_string("Abd23Def45");

    }

}
