package src.CodePractice;

/*
Fix the code in the Code tab so the function returns true if and only if x is equal to 7.
Challenge.isSeven(4) ➞ false
Challenge.isSeven(9) ➞ false
Challenge.isSeven(7) ➞ true
 */

import java.util.Scanner;

public class EqualToSeven {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        if(input == 7){
            System.out.print(true);
        }
        else
            System.out.print(false);
    }
}
