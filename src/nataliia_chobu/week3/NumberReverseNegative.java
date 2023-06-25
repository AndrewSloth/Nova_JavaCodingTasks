package nataliia_chobu.week3;

public class NumberReverseNegative {
    /*
   Write a return method that can reverse negative number and return it as int
    */
    public static void main(String[] args) {
        System.out.println(reversedNegative(-100));

    }

    public static int reversedNegative(int num){
      int reversed=0;


      if (num<0){
         num = num*(-1);
      }
      while (num!=0){
          int eachNumber=num%10;
          num/=10;
          reversed = reversed*10+eachNumber;
      }

      return reversed;
    }


}
