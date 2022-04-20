package src.CodePractice;

/*
Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
Test Data:
scenario 1:
Input first number: 9
Input second number: 10
scenario 2:
Input first number: 9
Input second number: 9
scenario 3:
Input first number: 9
Input second number: 1
Expected output:
scenario 1: true
scenario 2: false
scenario 3: true
 */

import java.util.Scanner;

public class Makes10 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        if(firstNumber == 10 || secondNumber == 10 || sum == 10){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
    }
}
