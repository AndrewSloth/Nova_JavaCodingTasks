package nataliia_chobu.week3;

public class ReverseNegativeNumbers {
    public static void main(String[] args) {
        System.out.println("reverse(-1897) = " + reverse(-1897));
        System.out.println(reverse(-100));
    }
    public static int reverse(int nums){
        int reverse=0;
        String numsStr=""+nums;
        String result="";

        for(int i=numsStr.length()-1; i>0; i--){
            result+=numsStr.charAt(i);
        }
        reverse=-Integer.parseInt(result);
        return reverse;
    }
}
