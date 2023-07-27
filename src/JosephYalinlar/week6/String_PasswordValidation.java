/*
Write a return method that can verify if a password is valid or not. Requirements:
Password MUST be at least 6 characters and should not contain space - Done
Password should at least contain one upper case letter - Done
Password should at least contain one lowercase letter - Done
Password should at least contain one special characters - Done
Password should at least contain a digit - Done
if all requirements above are met, the method returns true, otherwise returns false
 */
package JosephYalinlar.week6;

public class String_PasswordValidation {

    public static boolean validatePassword(String password) {
        boolean noSpace = !password.contains(" ");
        boolean leastSixChar = password.length() >= 6;
        boolean containsLowerCase = false;
        boolean containsUpperCase = false;
        boolean containsDigit = false;
        boolean containsSpecialChar = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isLowerCase(c)) {
                containsLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                containsUpperCase = true;
            } else if (Character.isDigit(c)) {
                containsDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                containsSpecialChar = true;
            }
        }

        return noSpace && leastSixChar && containsLowerCase && containsUpperCase && containsDigit && containsSpecialChar;
    }

    public static void main(String[] args) {
        String testPassword = "Hello123!";
        System.out.println("validatePassword(testPassword) = " + validatePassword(testPassword));
    }
}
