package nataliia_chobu.week2;

public class DivisibleBy {
    public static void main(String[] args) {
        int numbers = 100;
        String divisibleBy3 = "";
        String divisibleBy5 = "";
        String divisibleBy15 = "";

//        for (int i = 1; i <=numbers; i++) {
//
//            if (i % 15 == 0) {
//                divisibleBy15 += i + " ";
//            }
//            if (i % 5 == 0) {
//                divisibleBy5 += i + " ";
//            }
//            if (i % 3 == 0) {
//                divisibleBy3 += i + " ";
//            }
//        }

        for (int i = 1; i <=numbers; i++){
            if(i % 15 == 0){
                divisibleBy15 += i + " ";
            } else if (i % 5 == 0) {
                divisibleBy5 += i + " ";
            } else if (i % 3 == 0) {
                divisibleBy3 += i + " ";
            }
        }


        System.out.println("Divisible by 15: "+divisibleBy15);
        System.out.println("Divisible by 5: "+divisibleBy5);
        System.out.println("Divisible by 3: "+divisibleBy3);
    }
}
