package Erdene.week02;

public class Numbers_DivisibleBy_3_5_15 {

    public static void Divisible(){
        String DivisibleBy3 = " ", DivisibleBy5 = " ", DivisibleBy15 = " ";
        for (int i = 1; i < 101; i++) {

            if( i % 3 == 0 &&  i % 5 == 0 && i % 15 == 0 ){
                DivisibleBy15 += i + ", ";
            }
            if( i % 3 == 0 && !(i % 15 == 0)){
                DivisibleBy3 += i  + ", ";
            }
            if(i % 5 == 0 && !(i % 15 == 0)) {
                DivisibleBy5 += i  + ", ";
            }
        }
        System.out.println("DivisibleBy15 = " + DivisibleBy15);
        System.out.println("DivisibleBy5 = " + DivisibleBy5);
        System.out.println("DivisibleBy3 = " + DivisibleBy3);


    }
}
