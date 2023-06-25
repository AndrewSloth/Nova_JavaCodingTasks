package nataliia_chobu.week6;

public class PasswordValidatingTask {
    //      1) String - Password Validation Task
//Write a return method that can verify if a password is valid or not. Requirements:
// 1. Password MUST be at least 6 characters and should not contain space
//2. Password should at least contain one upper case letter
//3. Password should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//6. if all requirements above are met, the method returns true, otherwise returns false
    public static void main(String[] args) {
        System.out.println(isValidPassword("Heelloyou!1#"));
    }

    public static boolean isValidPassword(String str) {

        boolean valid = false;
        int uppercaseLetter = 0;
        int lowercaseLetter = 0;
        int specialCharacter = 0;
        int digit = 0;

        if (str.length() >= 6 && !str.contains(" ")) {

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseLetter++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseLetter++;
            } else if (Character.isDigit(ch)) {
                digit++;
            } else {
                specialCharacter++;
            }

        }
        if (uppercaseLetter >= 1 && lowercaseLetter >= 1 && specialCharacter >= 1 && digit >= 1) {
            valid = true;
        }else{
            valid=false;
        }
        return valid;

    }
        return false;
    }


}


