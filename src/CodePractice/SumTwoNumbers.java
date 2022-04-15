package src.CodePractice;

/*
Write a Java program to print the sum of two numbers.
Test Data:
Input first number: 74
Input second number: 36

Expected Output :
110
 */

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print(firstNumber+secondNumber);
    }
}
