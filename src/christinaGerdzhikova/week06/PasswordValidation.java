package christinaGerdzhikova.week06;

public class PasswordValidation {
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
