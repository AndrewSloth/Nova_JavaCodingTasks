package JosephYalinlar.week7;

//Write a method that can find the minimum number from an int Array
public class Array_FindMinimum {
    public static int findMinimum(int[] arr) {
        int minimumNumber = arr[0];
        for (int j : arr) {
            if (j < minimumNumber) {
                minimumNumber = j;
            }
        }
        return minimumNumber;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 7, 5};

        System.out.println(findMinimum(arr));
    }
}
/*
static int method in order to run the method in the class
int variable that assumes the first element to be the minimum
loop the array
if index in the iteration is smaller than minimum number the minimum number is updated
 */
