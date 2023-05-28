package Erdene.week02;

public class ConsectiveNumbers {

            public static void printConsecutiveNumbers(int N) {

                try {
                    if (N < 1) {
                        throw new Exception("Please enter positive numbers");
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }


                for (int i = 1; i < N; i++) {

                    if (i % 2 == 0 && i % 3 == 0) {
                        System.out.println("CodilityTest");
                        continue;
                    }

                    if (i % 2 == 0 && i % 5 == 0) {
                        System.out.println("CodilityCoders");
                        continue;
                    }

                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.println("TestCoders");
                        continue;
                    }

                    if (i % 2 == 0) {
                        System.out.println("Codility");
                        continue;
                    }
                    if (i % 3 == 0) {
                        System.out.println("Test");
                        continue;
                    }
                    if (i % 5 == 0) {
                        System.out.println("Coders");
                        continue;
                    }
                    System.out.println(i);

        }
    }
}
