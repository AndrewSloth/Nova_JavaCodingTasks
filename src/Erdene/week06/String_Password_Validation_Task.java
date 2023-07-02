package Erdene.week06;

public class String_Password_Validation_Task {


    //  1) String - Password Validation Task
    //Write a return method that can verify if a password is valid or not.
    // Requirements:
    // 1. Password MUST be at least 6 characters and should not contain space
    //Password should at least contain one upper case letter
    //Password should at least contain one lowercase letter
    //Password should at least contain one special characters
    //Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns false

    //This boolean method contains all 6 requirements as a boolean variable
    public static boolean isValidPassword(String password) {
        boolean req1 = password.length() >= 6 && !password.contains(" ");
        boolean req2 = false;  // has Upper case letter
        boolean req3 = false;  // has lower case letter
        boolean req4 = false;  // has Digit
        boolean req5 = false; // has Special Character

        //This will iterate through letters of the password and validates requirements.
        for (char each : password.toCharArray()) {

            if (Character.isUpperCase(each)) {
                req2 = true;
            } else if (Character.isLowerCase(each)) {
                req3 = true;
            } else if (Character.isDigit(each)) {
                req4 = true;
            } else {
                req5 = true;
            }

        }

        // if all the requirement are true it will return true
        return req1 && req2 && req3 && req4 && req5;
    }


    public static void main(String[] args) {
        System.out.println(isValidPassword("Supersecret123$"));
        System.out.println(isValidPassword("NotSuperSecret"));
    }
}
