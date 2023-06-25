package mariiaSuzdal.week_6;

public class PasswordValidationTask {
    public static void main(String[] args) {

        System.out.println(passwordValidation("AAg!!dGTjgg11"));
        System.out.println(passwordValidation("A1!a"));

        System.out.println(passwordValidation2("AAgdG!!Tjgg11"));

    }

    //first solution
    public static boolean passwordValidation(String password) {

        //create boolean for each requirement
        boolean digits = false;
        boolean specialChar = false;
        boolean isUpperCase = false;
        boolean isLowerCase = true;

        //check the fist main requirement
        if (password.length() < 6 || password.isBlank() || password.contains(" ")){
            return false;
        }

        // create for loop where check additional requirements
        for (char each : password.toCharArray()) {

            if (Character.isUpperCase(each)) {
                isUpperCase = true;
            }
            if (Character.isLowerCase(each)) {
                isLowerCase = true;
            }

            if (Character.isDigit(each)) {
                digits = true;
            }
            if (!Character.isLetterOrDigit(each)) {
                specialChar = true;
            }
        }

        return specialChar && digits && isUpperCase && isLowerCase;
    }


    //second solution
    public static boolean passwordValidation2(String password) {

        int digits = 0;
        int isUpperCase = 0;
        int isLowerCase = 0;
        int specialChar = 0;

        //check the fist main requirement
        if (password.length() < 6 || password.isBlank() || password.contains(" ")){
            return false;
        }

        // create for loop where check additional requirements
        for (char each : password.toCharArray()) {

            if (Character.isUpperCase(each)) {
                isUpperCase++;
            }

            if (Character.isLowerCase(each)) {
                isLowerCase++;
            }
            if (Character.isDigit(each)) {
                digits++;
            }

            if (!Character.isLetterOrDigit(each)) {
                specialChar++;
            }

        }


//create is statement if each var contains less than 1 return false if contains return true
        if (isUpperCase > 1 && isLowerCase > 1 && digits > 1 && specialChar > 1) {
            return true;
        }


        return false;
    }


}
/*
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space +
Password should at least contain one upper case letter +
Password should at least contain one lowercase letter +
Password should at least contain one special characters
Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */

