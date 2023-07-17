package mariiaSuzdal.week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNameAhmed {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron"));
        System.out.println(removeName(list1));

    }

    public static List<String> removeName(List<String> names) {
//I will use remove if method where I assign a condition, if value of list contains Ahmed, remove the name
        names.removeIf(p -> p.contains("Ahmed"));
        return names;
    }
}
/*
Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
Write a java operation to remove all the names named Ahmed
 */