package hayrengulPataer.week2;

public class PrintConsecutiveNumbers {

    public static void main(String[] args) {
        consecutiveNumber(24);



    }

    public static void consecutiveNumber(int n) {

       String result = "";
        String divisibleBy2 = " Codility";
        String divisibleBy3 = " Test";
        String  divisibleBy5 = "Coders";


        for (int i = 1; i <= n; i++) {

            if (i % 5 == 0 && i % 3 == 0 && i % 2 == 0) {
                result = divisibleBy2 + divisibleBy3 + divisibleBy5;
            }else if(i % 2 == 0 & i % 3 == 0){
                result =  divisibleBy2 + divisibleBy3;
            }else if(i % 2 == 0 && i % 5 == 0){
                result = divisibleBy2 + divisibleBy5;
            }else if(i % 3 == 0 && i % 5 == 0){
                result =  divisibleBy3 + divisibleBy5;
            }else if(i % 2 == 0){
                result = divisibleBy2;
            }else if(i % 3 == 0){
                result = divisibleBy3;
            }else if(i % 5 == 0){
                result = divisibleBy5;
            }else{
                result = " " + i;
            }
            System.out.println(result);
        }
    }
}
