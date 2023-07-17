package hayrengulPataer.week8;

import java.util.Arrays;

public class MoveZero {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeros(1,0,2,0,3,0,4,0)));


    }


    public static int[] moveZeros(int... nums){

      int[] moved = new int[nums.length];

      int index = 0; // 1

      for(int each : nums){  // [1, 2, 3, 4, 0, 0, 0, 0]
          if(each != 0){
              moved[index] = each;
              index++;
          }
      }
        return moved;


    }

}

/*

1️⃣  Array_MoveZerosToTheEnd
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]

 */
