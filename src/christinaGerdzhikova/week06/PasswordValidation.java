package christinaGerdzhikova.week06;

public class PasswordValidation {

      //1) String - Password Validation Task
    //Write a return method that can verify if a password is valid or not. Requirements:
    //1. Password MUST be at least 6 characters and should not contain space
    //2. Password should at least contain one upper case letter
    //3. Password should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    //6. if all requirements above are met, the method returns true, otherwise returns false

    public static boolean passwordValidation(String password){

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int specialCharCount = 0;
        int digitCount = 0;

        if (password.length() >= 6 && !(password.contains(" "))){

            for (int i = 0; i < password.length(); i++) {

                if (Character.isDigit(password.charAt(i))){
                    digitCount++;
                }
                if (Character.isUpperCase(password.charAt(i))){
                    upperCaseCount++;
                }
                if (Character.isLowerCase(password.charAt(i))){
                    lowerCaseCount++;
                }
                if (!(Character.isLetterOrDigit(password.charAt(i)))){
                    specialCharCount++;
                }
            }
            if (upperCaseCount >= 1 && lowerCaseCount >= 1 && specialCharCount >= 1 && digitCount >= 1){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(passwordValidation("ru6QW2@"));
    }
}
