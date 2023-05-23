package SKuzmenko;

public class Divide {
    public static int divide(int firstNum, int secondNum) {

        if (secondNum == 0) {
            System.err.println("Error: Cannot divide by zero");
            return 0;
        }

        int result = 0;

        while (firstNum >= secondNum) {
            firstNum -= secondNum;
            result++;
        }

        return result;

    }
}
