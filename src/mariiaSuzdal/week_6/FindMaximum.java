package mariiaSuzdal.week_6;

public class FindMaximum {
    public static void main(String[] args) {

        //created array with numbers

        int[] numbers = {10, 70, 30, 40, 59};
        System.out.println(findMaximum(numbers));

    }

    public static int findMaximum(int[] numbers) {

        //created int with 0 value
        int maxNumber = 0;

        //created a for each loop for "numbers"
        for (int each : numbers) {
            //if maxNumber less than each in array I assigned it in maxNumber
            if (maxNumber < each) {
                maxNumber = each;
            }
        }
        return maxNumber;
    }
}
/*
Write a method that can find the maximum number from an int Array
 */