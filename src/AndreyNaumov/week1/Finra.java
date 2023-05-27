package AndreyNaumov.week1;

public class Finra {
    public static void main(String[] args) {
        String result = "";

        for( int i = 1; i < 30; i++){
            if( i % 15 == 0) {
                result += "FINRA ";
            } else if(i % 3== 0){
                result += "FIn ";
            }else if(i % 5 == 0){
                result += "RA ";
            }else{
                result += i + " ";
            }
        }
        System.out.println(result);


    }

    public static class OddOrEven {
        public static void oddEven(int num) {

            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }

    }
}

