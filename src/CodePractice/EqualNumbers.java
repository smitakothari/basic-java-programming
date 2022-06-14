package src.CodePractice;

/*
Create a function that returns true when x is equal to y; otherwise return false.
isSameNum(4, 8) ➞ false
isSameNum(2, 2) ➞  true
isSameNum(42, 32) ➞  false
 */

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        boolean result = false;
        if(firstNumber == secondNumber){
            result = true;
        }
        System.out.print(result);
    }
}
