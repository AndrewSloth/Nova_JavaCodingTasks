package AndrewBalint.week6;

public class Week6Utility {

    public static void main(String[] args) {

        int[] array = {1,4,123,6,4,23,5,6,7,4,122};

        System.out.println(maxNum(array));

        System.out.println(returnSum("00000102540004"));

        System.out.println(validate("Ae W2!"));

    }

    /*
     1) String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
Password should at least contain one upper case letter
Password should at least contain one lowercase letter
Password should at least contain one special characters
Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false*/

    public static boolean validate(String password){



        //Check length and no spaces first
        if(password.length()>6 && !password.contains(" ")){

            boolean upper = false,
                    lower = false,
                    digit = false,
                    specialChar  = false;

            for(char each : password.toCharArray()){
                if(Character.isUpperCase(each)){
                    upper=true;
                }

                if(Character.isLowerCase(each)){
                    lower=true;
                }

                if(Character.isDigit(each)){
                    digit=true;
                }

                if(!Character.isLetterOrDigit(each)){
                    specialChar=true;
                }

            }

            if(!upper || !lower || !specialChar || !digit){
                return false;
            }

        }
        else {
            return false;
        }



        return true;

    }

/*    2) String - sum of digits in a string
Write a method that can return the sum of the digits in a string
*/
    public static int returnSum(String digits){

       int sum =0; //variable to keep track of the sum

        //Split string into individual characters and loop through
       for (String each : digits.split("")){
           sum+=Integer.parseInt(each); //parse int from each one and add to sum
       }

        return sum;
    }


  /*  3) Array - Find Maximum
Write a method that can find the maximum number from an int Array
     */
    public static int maxNum(int[] intArray){
        int max = Integer.MIN_VALUE; //Set original max value to lowest possible number

        //Loop through array and replace max with each, if each is greater
        for (int each : intArray){
            if(each>max){
                max=each;
            }
        }

        return max; //return max value
    }
}