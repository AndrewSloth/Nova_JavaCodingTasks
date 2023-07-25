package christinaGerdzhikova.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveSomeValues {

    public static ArrayList<Integer> removeValues(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if (each > 100){
                continue;
            }
            result.add(each);
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));

        System.out.println(removeValues(list));
    }
}
