package Erdene.week05;

import java.util.Stack;

public class String_Reverse {

    public static void reverse(String str) {

        // In this task we employ Stack class, since this class implements Last In First Out principle.


        // First let's create Stack
        Stack<Character> uni = new Stack<>();

        // Then create a String to store reversed String
        String res = "";

        //Iterate through  and push the given String stack
        for(char each : str.toCharArray()) {
            uni.push(each);
        }

        //Storing letters in Stack into res String.
        while(!(uni.isEmpty())){
        res += uni.pop();
        }

        System.out.println(res);

    }

    public static void main(String[] args) {
        reverse("TEDS");
    }

}
