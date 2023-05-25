package nataliia_chobu.week2;

public class SwapNumbers {
    public static void main(String[] args) {

     swapNumbers(5,9);

    }
    public static void swapNumbers(int a,int b) {
        a = a + b;//5+9=14
        b = a - b;//14-9=5
        a = a - b;//14-5=9
        System.out.println("a = " + a + ", b = " + b);

    }

}
