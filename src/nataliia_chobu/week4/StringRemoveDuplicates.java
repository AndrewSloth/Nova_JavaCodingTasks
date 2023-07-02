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
//I convert str into array string
        String [] strArray=str.split("");
        //create Set object and passed array String into constructor LInkedHashSet doesn't accept duplicates and maintains insertion order

        Set<String> stringLinkedHashSet=new LinkedHashSet<>(Arrays.asList(strArray));
// then I did method chaining to convert collection into String and removed extra symbols to return in String view
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
