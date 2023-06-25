package hayrengulPataer.week3;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
        reverseNegativeNumber(-1000);

    }


    public static int reverseNegativeNumber(int num) {
        int reverse = 0;
        if(num < 0){
            num = num * (-1);
        }
        while (num != 0){
            int eachNumber = num % 10;
            reverse = reverse * 10 + eachNumber;
            num = num / 10;
        }
        return reverse;
    }
}
/*
Write a return method that can reverse negative number and return it as int
 */
