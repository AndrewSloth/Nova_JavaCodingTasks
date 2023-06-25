package JosephYalinlar.week2;

public class dividedBy3_5_15 {
    public static void main(String[] args) {
        System.out.print("Divided by 15: ");
        for (int i = 1; i <= 100; i++) {
            if (i%15 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.print("\nDivided by 5: ");
        for (int j = 1; j <= 100; j++) {
            if (j%5 == 0){
                System.out.print(j + " ");
            }
        }
        System.out.print("\n Divided by 3: ");
        for (int j = 1; j <= 100; j++) {
            if (j%3 == 0){
                System.out.print(j + " ");
            }
        }
    }
}
