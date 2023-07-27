package JosephYalinlar.week6;

public class String_PasswordValidation {
    boolean noSpace = true, leastSixChar = false, hasUpperCase = false, hasLowerCase = false, hasSpecialChar =
            false, hasDigit = false;

    public boolean validatePassword(String password) {


        if (password.contains(" ")) {
            noSpace = false;
        }
        if (password.length() < 6) {
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


        return false;
    }

    public static void main(String[] args) {

    }
}
/*
Write a return method that can verify if a password is valid or not. Requirements:
Password MUST be at least 6 characters and should not contain space - Done
Password should at least contain one upper case letter -
Password should at least contain one lowercase letter -
Password should at least contain one special characters -
Password should at least contain a digit -
if all requirements above are met, the method returns true, otherwise returns false
 */

