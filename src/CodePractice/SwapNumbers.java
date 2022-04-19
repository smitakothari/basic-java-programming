package src.CodePractice;

/*
Write a Java program to swap two variables.
Test Data:
Enter first number: 15
Enter second number: 27
Expected output:
Before swapping : a, b = 15, 27
After swapping : a, b = 27, 15
 */

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Before swapping: a, b = " + firstNumber + " , " + secondNumber);
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("After swapping: a, b = " + firstNumber + " , " + secondNumber);
    }
}
