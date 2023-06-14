package Erdene.week03;
/*
  2) Number - Reverse negative number
Write a return method that can reverse negative number and return it as int
 */
public class Number_Reverse {

    public static int Reverse(int N){
        // local variable for final result
        int res = 0;

        // if given number is already positive, method will print the number as it
        if(N > 0){
         res = N;
        }else{
            //otherwise, subtracting negative from zero will convert it to positive
            res = res - N;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Reverse(-23));
    }

}
