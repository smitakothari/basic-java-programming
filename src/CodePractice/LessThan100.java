package src.CodePractice;

/*
Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
lessThan100(22, 15) ➞ true
lessThan100(83, 34) ➞ false
lessThan100(3, 77) ➞ true
 */

import java.util.Scanner;

public class LessThan100 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        if(sum < 100){
            System.out.print(true);
        }
        else
            System.out.print(false);
    }
}
