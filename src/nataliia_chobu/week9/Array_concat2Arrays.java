package nataliia_chobu.week9;

import java.util.Arrays;

public class Array_concat2Arrays {
    public static void main(String[] args) {
        System.out.println("int array = "+Arrays.toString(mergedArray(new int[]{1,2,3,4},new int[]{5,6,7,8})));
        System.out.println("char array = " + Arrays.toString(mergedArray(new char[]{'a','b','c'},new char[]{'d','f','g'})));
    }

    //Write a return method that can concatenate two arrays

    public static int[] mergedArray(int[] arr1, int[] arr2) {
        int[] joinedArr = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++, index++) {
            joinedArr[index] = arr1[i];
        }

        for (int j = 0; j < arr2.length; j++, index++) {
            joinedArr[index] = arr2[j];
        }
        return joinedArr;
    }
    public static char[] mergedArray(char[] arr1,char[] arr2){
        int t=0;
        char [] mergedArray=new char[arr1.length+ arr2.length];

        for(int i=0; i< arr1.length;i++,t++){
            mergedArray[t]=arr1[i];
        }
        for(int j=0;j< arr2.length;j++,t++){
            mergedArray[t]=arr2[j];
        }
        return mergedArray;
    }
 }
