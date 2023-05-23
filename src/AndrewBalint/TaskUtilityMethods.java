package AndrewBalint;

public class TaskUtilityMethods {


    public static void main(String[] args) {

        System.out.println(identify(-5));

        System.out.println(NDivide(30,-10));


        FINRA();

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
            case -1: //For negative numbers
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
        boolean negative = false;

        if(n1<0){
            n1=n1*(-1);
            negative=true;
        }
        else if (n2<0) {
            n2=n2*(-1);
            negative=true;
        }


        while(n1>=n2){
            n1-=n2;
            result++;
        }

        if(negative)
            result*=(-1);

        return result;

        /*
            NDivide without / operator:umbers -
Write a method that can divide two numbers without using division operator
         */
    }

    public static void FINRA(){

        for(int i =1; i<=30;i++){

            if(i%3==0){
                if(i%5==0){
                    System.out.print("FINRA ");
                }
                else{
                    System.out.print("FIN ");
                }

            }
            else if(i%5==0){
                System.out.print("RA ");
            }
            else{
                System.out.print(i+" ");
            }
        }

        /*
        FINRA:
            Write a function which prints out the numbers from 1 to 30 but for numbers
            which are a multiple of 3, print "FIN" instead of the number and for numbers
            which are a multiple of 5, print "RA" instead of the number. For numbers which are a
            multiple of both 3 and 5, print "FINRA" instead of the number.
         */
    }


}
