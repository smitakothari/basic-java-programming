package src.CodePractice;

/*
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */

import java.util.Scanner;

public class Close10 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        int diff1, diff2;
        if(firstNumber >= 10 ){
           diff1 = firstNumber - 10;
        } else {
            diff1 = 10 - firstNumber;
        }
        if(secondNumber >= 10 ){
            diff2 = secondNumber - 10;
        }
        else diff2 = 10 - secondNumber;
        if(diff1 > diff2){
            System.out.print(secondNumber);
        } else if (diff2 > diff1) {
            System.out.print(firstNumber);
        } else System.out.print(0);
    }
}
