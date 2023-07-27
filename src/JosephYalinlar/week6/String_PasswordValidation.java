package JosephYalinlar.week6;

public class String_PasswordValidation {
    static boolean noSpace = true;
    static boolean leastSixChar = false;
    static boolean hasUpperCase = false;
    static boolean hasLowerCase = false;
    static boolean hasSpecialChar =
            false;
    static boolean hasDigit = false;

    public static boolean validatePassword(String password) {


        if (password.contains(" ")) {
            noSpace = false;
        }
        if (password.length() > 6) {
            leastSixChar = true;
        }
        for (int i = 0; i < password.length(); i++) {

            hasLowerCase = Character.isLowerCase(password.charAt(i));
            if (hasLowerCase) {
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {

            hasUpperCase = Character.isUpperCase(password.charAt(i));
            if (hasUpperCase) {
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {

            hasDigit = Character.isDigit(password.charAt(i));
            if (hasDigit) {
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {

            hasSpecialChar = (!Character.isDigit(i) && !Character.isLetter(i) && !Character.isWhitespace(i));
            if (hasSpecialChar) {
                break;
            }
        }
        if (noSpace && leastSixChar && hasLowerCase && hasUpperCase && hasDigit && hasSpecialChar) {
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        String testPassword = "Hello123!";
        System.out.println("validatePassword(testPassword) = " + validatePassword(testPassword));
    }
}
/*
Write a return method that can verify if a password is valid or not. Requirements:
Password MUST be at least 6 characters and should not contain space - Done
Password should at least contain one upper case letter - Done
Password should at least contain one lowercase letter - Done
Password should at least contain one special characters - Done
Password should at least contain a digit - Done
if all requirements above are met, the method returns true, otherwise returns false
 */

