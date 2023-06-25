package andreyNaumov.week_6;

import java.util.Arrays;

public class Week_6 {


    /**
     * 1) String - Password Validation Task
     * Write a return method that can verify if a password is valid or not. Requirements:
     * 1. Password MUST be at least 6 characters and should not contain space
     * Password should at least contain one upper case letter
     * Password should at least contain one lowercase letter
     * Password should at least contain one special characters
     * Password should at least contain a digit
     * if all requirements above are met, the method returns true, otherwise returns false
     *
     * @param pass
     * @return
     */
    public static boolean passValidation(String pass) {
        //   1) String - Password Validation Task
        //Write a return method that can verify if a password is valid or not. Requirements:

        // 1. Password MUST be at least 6 characters and should not contain space
        if (pass.length() >= 6 && !pass.contains(" ")) {

            boolean isUpperCaseLetter = false, isLowerCaseLetter = false, isSpecialChar = false, isDigit = false;

            for (Character ch : pass.toCharArray()) {
                //Password should at least contain one upper case letter
                if (Character.isUpperCase(ch)) {
                    isUpperCaseLetter = true;
                }
                //Password should at least contain one lowercase letter
                if (Character.isLowerCase(ch)) {
                    isLowerCaseLetter = true;
                }
                //Password should at least contain a digit
                if (Character.isDigit(ch)) {
                    isDigit = true;
                }
                //Password should at least contain one special characters
                if (!Character.isLetterOrDigit(ch)) {
                    isSpecialChar = true;
                }

                //if all requirements above are met, the method returns true, otherwise returns false
                if (isDigit && isSpecialChar && isLowerCaseLetter && isUpperCaseLetter) {
                    return true;
                }
            }

            return false;

        } else {
            return false;
        }


    }

    /**
     * 2) String - sum of digits in a string
     * Write a method that can return the sum of the digits in a string
     *
     * @param str
     * @return
     */
    public static int digitsSum(String str) {
        int result = 0;

        for (Character ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                result += Character.getNumericValue(ch);
            }
        }


        return result;
    }

    /** 3) Array - Find Maximum
     *  Write a method that can find the maximum number from an int Array
     *
     * @param arr
     * @return
     */
    public static int maxNumThruLoop(int[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException();
        }
        int result = arr[0];

        for (int num : arr) {
            if (num > result) {
                result = num;
            }
        }
        return result;
    }
    public static int maxNumThruSort(int[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException();
        }

       Arrays.sort(arr);

        int result = arr[arr.length-1];
        return result;
    }


    public static void main(String[] args) {

        String str = "asdQ2!e";
        System.out.println(passValidation(str));

        System.out.println(digitsSum(str));



        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10,-78,654,-5,-5,-34,-5,-634,56,-456,6398565,};
        long t1 = 0;
        long t2 = 0;

        System.out.println("-------------maxNumThruLoop------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("maxNumThruLoop(arr1) = " + maxNumThruLoop(arr1));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();

        System.out.println("-------------maxNumThruSort------------------------------");
        t1 = System.currentTimeMillis();
        System.out.println("maxNumThruSort(arr1) = " + maxNumThruSort(arr1));
        t2 = System.currentTimeMillis();
        System.out.println("It takes " + (t2 - t1) + " milliSec");
        System.out.println();


    }

}
