package akmalSalomov.week3;

public class ReverseNegativeNumber {

    // Write a return method that can reverse negative number and return it as int

    public static int reversedNumber(int number){


    int reversedNumber = 0;

        while(number !=0)

    {
        int digit = number % 10;
        reversedNumber = reversedNumber * 10 + digit;
        number /= 10;
    }

    reversedNumber *=-1; // we multiply the result by -1 to make it negative
    return reversedNumber;
    // We initialized the negative number as a number. Then we used 'while' loop to extract digits of the number
    // from right to left and build reversed number 'reversedNumber'. We multiplied the result by -1 to make it negative

}

    public static void main(String[] args) {
        System.out.println(reversedNumber(-12345));
    }



}
