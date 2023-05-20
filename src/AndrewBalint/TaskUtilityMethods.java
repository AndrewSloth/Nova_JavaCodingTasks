package AndrewBalint;

public class TaskUtilityMethods {


    public static void main(String[] args) {

        System.out.println(identify(11));

        System.out.println(NDivide(99,25));

    }

    public static String identify(int num){

        String result="";
        switch (num%2) {
            case 0:
                result= "Even";
                break;
            case 1:
                result= "Odd";
                break;
        }

        return result;
        /*
                Write  a method which can identify given number is even or odd
            Output ex:
            identify(5); ->"Odd"
            identify(6); ->"Even"
         */

    }

    public static int NDivide(int n1, int n2){
        int result =0;

        while(n1>=n2){
            n1-=n2;
            result++;
        }


        return result;

        /*
            NDivide without / operator:umbers -
Write a method that can divide two numbers without using division operator
         */
    }



}
