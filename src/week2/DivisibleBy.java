package week2;

public class DivisibleBy {

    public static void main(String[] args) {

        String divisibleBy15 = "Divisible by 15: ";
        String divisibleBy5 = "Divisible by 5: ";
        String divisibleBy3 = "Divisible by 3: ";


        for (int i = 1; i <= 100 ; i++) {

            if(i % 15 == 0){
                divisibleBy15 += i + " ";
            }
            if(i % 5 == 0 && i % 15 != 0){
                divisibleBy5 += i + " ";
            }
            if(i % 3 == 0 && i % 15 != 0){
                divisibleBy3 += i + " ";
            }
        }
        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);
    }
}
