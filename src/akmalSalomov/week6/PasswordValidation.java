package akmalSalomov.week6;

/*
1) String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
Password should at least contain one upper case letter
Password should at least contain one lowercase letter
Password should at least contain one special characters
Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */
public class PasswordValidation {

    public static boolean ValidPassword(String password) {
        if (password.length() < 6) {
            return false;
        }
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialCharacter = false;
        boolean hasDigit = false;

/*
I have initialized four boolean variables: hasUppercase, hasLowercase, hasSpecialCharacter and hasDigit to false.
After that I looped through each character in the String password using the toCharArray method to convert String to Array
characters.
After that for each character, the code checks if it is an uppercase letter, a lowercase letter, a digit, or a special
character. If the character is uppercase letter than hasUppercase is set to true and SO ON  with rest of the conditions.
If all the boolean conditions a met than the method returns ture, otherwise false
 */

        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(each)) {
                hasLowercase = true;
            } else if (Character.isDigit(each)) {
                hasDigit = true;
            } else {
                hasSpecialCharacter = true;
            }
        }
        return hasUppercase && hasLowercase && hasSpecialCharacter && hasDigit;
    }

    public static void main(String[] args) {
        System.out.println("ValidPassword(\"Akm@1jon\") = " + ValidPassword("Akm@1jon")); // true
        System.out.println("ValidPassword(\"akm@1jon\") = " + ValidPassword("akm@1jon")); // false --> no upperCasa
        System.out.println("ValidPassword(\"AKM@1JON\") = " + ValidPassword("AKM@1JON")); // false --> no  lowercase
        System.out.println("ValidPassword(\"akm@ljon\") = " + ValidPassword("akm@ljon")); // false --> no special char
        System.out.println("ValidPassword(\"Akm@ljon\") = " + ValidPassword("Akm@ljon")); // false --> no digit
    }
}

