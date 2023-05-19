package AndreyNaumov;


/*
Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
public class finra {

    public static void finra(int number){
        String res = "";

        if(number % 3 == 0 && number % 5 == 0){
            res = "FINRA";
        }else if(number % 5 == 0){
            res = "RA";
        }else if(number % 3 == 0){
            res = "FIN";
        }else {
            System.out.println(number);
        }

        System.out.println(res);
    }
}
