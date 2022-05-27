package src.CodePractice;

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 2 int values, return true if one or the other is teen, but not both.
Test Data:
Input first number: 13
Input second number: 99

Expected Output : true
 */

import java.util.Scanner;

public class LoneTeen {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();
        boolean result = false;
        if( (firstNumber >= 13 && firstNumber <= 19) || (secondNumber >= 13 && secondNumber <= 19)){
            result = true;
        }
        if( (firstNumber >= 13 && firstNumber <= 19) && (secondNumber >= 13 && secondNumber <= 19)){
            result = false;
        }
        System.out.print(result);
    }
}
