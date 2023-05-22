package Erdene;

public class Finra {
    public static void finra(){
        String res = "";

        for(int number = 1; number <= 30; number++) {

            if (number % 3 == 0 && number % 5 == 0) {
                res += "FINRA, ";
            } else if (number % 5 == 0) {
                res += "RA, ";
            } else if (number % 3 == 0) {
                res += "FIN, ";
            } else {
                res += number + ", ";
            }
        }

        System.out.println(res);
    }

}
