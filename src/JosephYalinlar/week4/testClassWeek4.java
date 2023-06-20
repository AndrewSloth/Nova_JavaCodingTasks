package JosephYalinlar.week4;

import java.util.Scanner;

public class testClassWeek4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Same Letters or not?\nYour First String:");
        String firstString = scanner.nextLine();
        System.out.println("Your Second String:");
        String secondString = scanner.nextLine();
        SameLetters SameLetters = new SameLetters();
        System.out.println("Does your strings contain the same letters: "+SameLetters.checkSameLetters(firstString,secondString)+"\n" +
                "----------------------------------------------------------------");
        System.out.println("Remove Duplicate Letters from your string\nPlease enter your string:");
        String thirdString = scanner.nextLine();
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println("Your string when duplicate characters removed is: "+removeDuplicates.removeDuplicates(thirdString));
    }
}
