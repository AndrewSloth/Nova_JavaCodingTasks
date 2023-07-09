package andreyNaumov.week_6;

import java.util.Arrays;

public class Raphael_IQ {

    public static void main(String[] args) {
//Given an array of positive and negative integers with a size of ten, return the two integers that, when multiplied, return the highest number
        int[] arr = new int[]{-5666, -5123, 4, 587, 999, 987, 540, 4, 84, 654};

        Arrays.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));

        int num1 = arr[0] * arr[1];
        int num2 = arr[arr.length - 1] * arr[arr.length - 2];
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        if (num1 > num2) {

            System.out.println("arr[0] = " + arr[0]);
            System.out.println("arr[1] = " + arr[1]);
        }
        if (num2 > num1) {
            System.out.println("arr[arr.length - 1] = " + (arr[arr.length - 1]));
            System.out.println("arr[arr.length - 2] = " + (arr[arr.length - 2]));
        }


        System.out.println("maxBy2(arr) = " + Arrays.toString(maxBy2(arr)));


    }


    public static int[] maxBy2(int[] intArray){

        int[] top2 = new int[2];
        int highestProduct = Integer.MIN_VALUE;

        for(int i = 0; i<10;i++){
            for(int j = 0; j<10;j++){

                if(i!=j && intArray[i]*intArray[j]>highestProduct){
                    highestProduct=intArray[i]*intArray[j];
                    top2[0]=intArray[i];
                    top2[1]=intArray[j];
                }

            }

        }

        return top2;
    }


}
