package src.CodePractice;

/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.
Test Data:
Scenario 1 -
Input first number: 1
Input second number: 2
Scenario 2 -
Input first number: 3
Input second number: 2
Scenario 3 -
Input first number: 2
Input second number: 2
Expected output:
Scenario 1 - 3
Scenario 2 - 5
Scenario 3 - 8
 */

import java.util.Scanner;

public class sumDouble {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        int sum = 0;
        if(firstNumber != secondNumber)
        {
            sum = firstNumber + secondNumber;
        }
        else{
            sum = 2 * (firstNumber + secondNumber);
        }
        System.out.print(sum);
    }
}
