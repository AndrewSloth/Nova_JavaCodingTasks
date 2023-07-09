package mariiaSuzdal.week_7;

public class FindMinimum {

    public static void main(String[] args) {

        int[] numbers = {90, 70, 30, 40, 59};
        System.out.println(findMin(numbers));

        int[] numbers2 = {-90, 70, -30, 40, 59};
        System.out.println(findMin(numbers2));

    }


    public static int findMin(int[] listNumbers) {

        //created int with min value of the first element of the array
        int newList = listNumbers[0];
        //created a for each loop for "listNumbers"
        for (int each : listNumbers) {
            //if each less than newList in array I assigned it in newList
            if (each < newList) {
                newList = each;
            }

        }
        return newList;
    }


}
/*
Array - Find Minimum
Write a method that can find the minimum number from an int Array
 */