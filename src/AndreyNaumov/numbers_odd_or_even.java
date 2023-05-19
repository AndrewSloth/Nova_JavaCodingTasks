package AndreyNaumov;



/*
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
 */
public class numbers_odd_or_even {

    public static void identify(int number){
        if( number % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }



}
