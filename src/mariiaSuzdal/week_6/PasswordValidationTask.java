package mariiaSuzdal.week_6;

public class PasswordValidationTask {

    public static void main(String[] args) {

        System.out.println(passwordValidation("AAgdGTjgg11"));

    }

    public static boolean passwordValidation(String password) {

        for (int i = 0; i < password.length(); i++) {

            if (password.length() < 6) {
                System.exit(1);
                System.out.println("Your password must have more than 6 characters");
            }

            if (password.isBlank()) {
                System.exit(1);
                System.out.println("Your password must not contain space");
            }


        }

        return false;
    }
}
/*
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
Password should at least contain one upper case letter
Password should at least contain one lowercase letter
Password should at least contain one special characters
Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
 */