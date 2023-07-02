package Erdene.week07;

public class Array_Find_Minimum {

    //    1) Array - Find Minimum
    //      Write a method that can find the minimum number from an int Array

    //This method accepts series of numbers and put them in int array and find max number

    public static void find_minimum(int... numbers){
        //puts series of number in array
        int[] array = numbers;

        //creates int to store minimum number. it should be the highest value number so any given number will be lesser value than it
        int min = Integer.MAX_VALUE;

        //iterate through array
        for(Integer each : numbers){
            // compare them to find max value number
            if(each < min){
                //assign/reassign max value number
                min = each;
            }
        }
        System.out.println("max Number= " + min );
    }

    public static void main(String[] args) {
        find_minimum(23,1,34,-345);
    }
}
