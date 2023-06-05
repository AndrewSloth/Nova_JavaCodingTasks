package SKuzmenko.week3;

public class Week3 {
    public static void main(String[] args) {
        int number = 1;
        if (Prime(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }

        String s = "AAABBCDD";
        String freq = CharFrequency(s);
        System.out.println(freq);
    }

    public static boolean Prime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static String CharFrequency(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (!result.contains(String.valueOf(currentChar))) {
                result += currentChar + String.valueOf(count);
            }
        }

        return result;
    }


}
