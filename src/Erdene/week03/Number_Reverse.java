package Erdene.week03;
/*
  2) Number - Reverse negative number
Write a return method that can reverse negative number and return it as int
 */
public class Number_Reverse {

    public static int Reverse(int N){
        int res = 0;
        if(N > 0){
         res = N;
        }else{
            res = res - N;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Reverse(23));
    }

}
