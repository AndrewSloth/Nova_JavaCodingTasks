package Erdene.week04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class String_RemoveDuplicates {

    /*

    Write a return method that can remove the duplicated values from String
                Ex: removeDup("AAABBBCCC") ==> ABC

     */
    public static String removeDuplicate(String str){
        String removed="";

        char[] chars = str.toCharArray();

        for(char each : chars){
            if(!(removed.contains(each+""))){
                removed += each;
            }
        }
        return removed;
    }


    public static void removeDup(String str){

        Set<Character> removed = new LinkedHashSet<Character>();

        for(char each : str.toCharArray()){
            removed.add(Character.valueOf(each));
        }

        System.out.println(removed.toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", ""));

    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("ssssddddffff"));

        removeDup("aadsddddsssaalk");

    }
}
