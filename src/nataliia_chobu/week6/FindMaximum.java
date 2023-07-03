package nataliia_chobu.week6;

public class FindMaximum {
//        3) Array - Find Maximum
//    Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {
        System.out.println(maxNum(new int [] {-2,2,3,-6,7,4,5,9}));
    }
    public static int maxNum(int [] numbers){
       int max=numbers[0];
       for( int each: numbers){
           if(max<each){
               max=each;
           }
       }
       return max;
    }
}
