package AndrewBalint;

import java.util.Scanner;

public class PrintConsecutiveNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = in.nextInt();

        for (int i =1; i<=n; i++){

            if(i%2==0){

                System.out.print("Codility");
                if(i%3==0){

                    System.out.print("Test");
                    if(i%5==0){
                        System.out.print("Coders");
                    }


                }
                else if(i%5==0){

                    System.out.print("Coders");

                }

                System.out.println();

            }
            else if(i%3==0){

                System.out.print("Test");
                if(i%5==0){
                    System.out.print("Coders");
                }
                System.out.println();

            }
            else if(i%5==0){

                System.out.println("Coders");

            }
            else{
                System.out.println(i);
            }

        }


    }
}
