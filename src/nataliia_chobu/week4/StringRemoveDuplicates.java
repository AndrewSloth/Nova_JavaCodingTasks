package nataliia_chobu.week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringRemoveDuplicates {

//➡️ String -- Remove Duplicates
//    Write a return method that can remove the duplicated values from String
//    Ex: removeDup("AAABBBCCC") ==> ABC

    public static void main(String[] args) {
        System.out.println(removeDuplicates2("AAABBBCCCDDDD"));
        System.out.println(removeDuplicates("JJJAAABBBCCCDDDD"));
    }
    public static String removeDuplicates(String str){

        String [] strArray=str.split("");
        Set<String> stringLinkedHashSet=new LinkedHashSet<>(Arrays.asList(strArray));

        return stringLinkedHashSet.toString().replace("[", "").replace("]", "").replace(",", "").replace(" ","");
    }

    public static String removeDuplicates2(String str){
        String result="";

        for(int i=0;i <str.length();i++){
            char ch=str.charAt(i);
            if(!result.contains(""+ch)){
                result+=ch;
            }
        }
        return result;

    }

}
