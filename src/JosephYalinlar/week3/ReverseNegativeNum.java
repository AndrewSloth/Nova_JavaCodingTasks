/*
Write a return method that can reverse negative number and return it as int
 */


package JosephYalinlar.week3;

import java.util.Scanner;

public class ReverseNegativeNum {
    public int reverseNegativeNum(int num) {
        if (num >= 0) {
            return num;
        } else {
            num *= -1;
        }
        return num;
    }
}





