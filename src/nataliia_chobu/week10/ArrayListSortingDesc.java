package nataliia_chobu.week10;

import java.util.ArrayList;

public class ArrayListSortingDesc { public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();

    // Add elements to the ArrayList
    numbers.add(4);
    numbers.add(2);
    numbers.add(7);
    numbers.add(1);
    numbers.add(5);
    System.out.println(sortArraylist(numbers));
}


    //  Write a method that can sort the ArrayList in Ascending order without using the sort method.
    public static ArrayList<Integer> sortArraylist(ArrayList<Integer> nums) {

        // Iterate through the array
        for (int i = 0; i < nums.size() - 1; i++) {
            int minValue = nums.get(i);
            int minIndex = i;

            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(j) > minValue) {
                    minValue = nums.get(j);
                    minIndex = j;
                }
            }
            int temp = nums.get(i);
            nums.set(i, minValue);
            nums.set(minIndex, temp);
        }

        return nums;


    }
}

