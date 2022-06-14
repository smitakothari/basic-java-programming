package src.CodePractice;

/*
Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero, otherwise return false.
lessThanOrEqualToZero(5) ➞ false
lessThanOrEqualToZero(0) ➞ true
lessThanOrEqualToZero(-2) ➞ true
 */

import java.util.Scanner;

public class LessOrEqualToZero {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean result = false;
        if(number <= 0){
            result = true;
        }
        System.out.print(result);
    }
}
