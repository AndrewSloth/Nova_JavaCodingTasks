package nataliia_chobu.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveSomeValues {
    //Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
    public static void main(String[] args) {
        System.out.println( nums(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300))));
        System.out.println(numsLoop(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300))));

    }


    public static List<Integer> nums(List<Integer> givenNums){

        givenNums.removeIf(t->t>100);
        return givenNums;
    }


    public static List<Integer> numsLoop(List<Integer> numbers){
        for(int i=numbers.size()-1;i>=0;i--){
            if(numbers.get(i)>100){
                numbers.remove(i);
            }
        }

        return numbers;
    }
}
