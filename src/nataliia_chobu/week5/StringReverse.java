package nataliia_chobu.week5;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
    }

//    String - Reverse
//    Write a return method that can reverse String
//    Ex: Reverse("ABCD"); ==> DCBA
    public static String reverse(String str){
        String result="";

        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            result+=ch;
        }


        return result;

    }
}
