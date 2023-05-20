package Erdene;

public class Finra {
    public static void finra(int number){
        String res = "";

        if(number % 3 == 0 && number % 5 == 0){
            res = "FINRA";
        }else if(number % 5 == 0){
            res = "RA";
        }else if(number % 3 == 0){
            res = "FIN";
        }else {
            System.out.println(number + " can not be divided by 3 or 5");
        }

        System.out.println(res);
    }

}
