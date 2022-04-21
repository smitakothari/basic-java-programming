package src.CodePractice;

/*
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.
Test Data:
Scenario 1 -
Input first number: 1
Input second number: -1
Input parameter negative: false
Scenario 2 -
Input first number: -1
Input second number: 1
Input parameter negative: false
Scenario 3 -
Input first number: -4
Input second number: -5
Input parameter negative: true
Expected output:
Scenario 1 - true
Scenario 2 -  true
Scenario 3 - true
 */

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Input parameter negative: ");
        boolean isNegative = scanner.nextBoolean();
        if(isNegative){
            if(firstNumber < 0 && secondNumber < 0){
                System.out.print(true);
            }
        }
        else if( firstNumber < 0 && secondNumber > 0){
            System.out.print(true);
        }
        else if (firstNumber > 0 && secondNumber < 0){
            System.out.print(true);
        } else{
            System.out.print(false);
        }
    }
}
