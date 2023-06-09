package akmalSalomov.week2;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

        int n = 24;

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 15 == 0) {
                System.out.println("TestCoders");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else {
                System.out.println(i);
            }
        }

    }
}
