package akmalSalomov.week5;

public class FindUniqueCharacters_solution2 {

    public static void main(String[] args) {

        String str = "aabcccd";

        String unique = "";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // a
            int frequency = 0;


            for (int i = 0; i < str.length(); i++) { // checks how many times the ch has appeared in str
                if(str.charAt(i) == ch){ // if the ch has appeared i n the string
                    frequency ++; // increase the frequency by 1
                }


            }
            if(frequency == 1){ // if the frequency is equal to 1, then it's unique
                unique += ch;
            }



        }

        System.out.println(unique);




    }
}
