package src.CodePractice;

/*
Write a Java program to divide two numbers and print on the screen.
Test Data :
Input first number: 50
Input second number: 3

Expected Output :
16
 */

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print(firstNumber/secondNumber);
    }
}
