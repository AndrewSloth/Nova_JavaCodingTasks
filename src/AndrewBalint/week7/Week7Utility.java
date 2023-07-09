package AndrewBalint.week7;

import java.util.Arrays;

public class Week7Utility {

    public static void main(String[] args) {

        int[] array = {1, 4, 67, 16, 1, 1, 1, 1, 1, 178, 0, -89};
        int[] array2 = {5};

        System.out.println(findMin(array2));
        bubbleSortAscending(array);

        System.out.println(Arrays.toString(array));

        bubbleSortDescending(array);

        System.out.println(Arrays.toString(array));

    }

    /*
    1) Array - Find Minimum
Write a method that can find the minimum number from an int Array
     */

    public static int findMin(int[] intArray){

        int min = intArray[0]; //Set intial min value to first array element


        //Loop through and check if each value is lower than the current min
        for(int i = 1; i<intArray.length; i++){
            if(intArray[i]<min){
                min = intArray[i]; //Reassign if so
            }
        }

        return min; //Return final product
    }

    /*
    2) Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
     */

    //I created this method with no help trying to figure out how to sort.
    public static void sortAscendingNoHelp(int[] intArray){

        Arrays.sort(intArray);

        //Loop through array
        for(int i = 0; i < intArray.length; i++){



            //For each element of the array, loop through a second time and swap all lesser elements
            //to the left of the array
            for(int j = 1; j < intArray.length-1; j++){



                //if the element is less than the one to the left of it, swap it
                if(intArray[j-1]>intArray[j]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j - 1];
                    intArray[j - 1] = temp;
                }

                //if the element is greater than the element to the right of it, swap it
                if(intArray[j]>intArray[j+1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }

            }
        }




    }

    //Bubble Sort Algorithm
    public static void bubbleSortAscending(int[] intArray){

        //iterate through array
        for(int i =0; i<intArray.length;i++){
            //for each element, iterate through array again and move all lesser values to the beginning
            for(int j=1; j<intArray.length; j++){

                //If earlier value is greater than current value, swap
                if(intArray[j-1]>intArray[j]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j - 1];
                    intArray[j - 1] = temp;
                }

            }
        }
    }

    /*
    3) Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
     */

    //Bubble Sort Algorithm
    public static void bubbleSortDescending(int[] intArray){

        //iterate through array
        for(int i =0; i<intArray.length;i++){
            //for each element, iterate through array again and move all lesser values to the beginning
            for(int j=1; j<intArray.length; j++){

                //If earlier value is less than current value, swap
                if(intArray[j-1]<intArray[j]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j - 1];
                    intArray[j - 1] = temp;
                }

            }
        }
    }

    //This is insertion sort. Pushing for now and trying to learn how it works.
    public static void insertionSortDescending(int[] intArray){



        //iterate through array
        for (int i = 1; i < intArray.length; i++) {
            int currentElement = intArray[i]; //key = 1
            int j = i - 1; //j=1

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && intArray[j] > currentElement) {
                intArray[j + 1] = intArray[j]; //2,3,3 ->
                j = j - 1; //j=0
            }

            intArray[j + 1] = currentElement;
            //1) 2,3,1 ->> 2)
        }
    }
}
