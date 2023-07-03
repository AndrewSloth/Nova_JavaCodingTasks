package nataliia_chobu.week7;

public class FindMinimum {
    public static void main(String[] args) {
        System.out.println("minArray() = " + minArray(new int [] {-1,2,3,5,6,-9}));
    }

//  1) Array - Find Minimum
//Write a method that can find the minimum number from an int Array

    public static int minArray( int[]nums){
        int min=nums[0];

        for(int each:nums){
           if( each<min){
               min=each;
           }
        }


        return min;
    }
}
