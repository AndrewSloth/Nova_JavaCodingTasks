package christinaGerdzhikova.week09;

import java.util.ArrayList;
import java.util.Arrays;

public class List_RemoveNameAhmed {

    public static void removeAhmed(ArrayList<String> names){
        names.removeIf(p -> p.equals("Ahmed"));
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ahmed", "We", "Need", "To", "Cook"));
        removeAhmed(list);

        System.out.println(list);
    }
}
