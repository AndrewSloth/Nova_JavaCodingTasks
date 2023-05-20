package GamzeTurus;

public class Finra {

    public static String finra(int num) {

        if (num >= 1 && num <= 30) {
            return (num % 15 == 0) ? "FINRA" : (num % 3 == 0) ? "FIN" : (num % 5 == 0) ? "RA" : "" + num;

        }
        return "invalid number";
    }


    }

