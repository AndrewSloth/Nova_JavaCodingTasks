package christinaGerdzhikova.week02;

public class SwapVariables {
    public static void main(String[] args) {
        int x = 6;
        int y = 8;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
