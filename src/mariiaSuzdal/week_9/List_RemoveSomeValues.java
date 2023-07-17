package mariiaSuzdal.week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveSomeValues {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300));
        System.out.println(removeNumbers(list1));
    }

    public static List<Integer> removeNumbers(List<Integer> numbers) {
//I will use remove if method where I assign a condition, if value of list greater than 100, remove the numbers
        numbers.removeIf(p -> p > 100);

        return numbers;
    }
}
/*
Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
 */