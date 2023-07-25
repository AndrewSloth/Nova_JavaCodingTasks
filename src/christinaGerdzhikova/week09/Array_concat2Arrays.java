package christinaGerdzhikova.week09;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_concat2Arrays {

    public static String[] concat2Arrays(String[] arr1, String[] arr2){

        ArrayList<String> list = new ArrayList<>();
        for (String each : arr1) {
            list.add(each);
        }
        for (String each : arr2) {
            list.add(each);
        }

        String[] result = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] arr1 = {"Jesse","we","need","to","cook"};
        String[] arr2 = {"1","2","4","4","5","5","5","6","8"};

        System.out.println(Arrays.toString(concat2Arrays(arr1, arr2)));

    }
}
