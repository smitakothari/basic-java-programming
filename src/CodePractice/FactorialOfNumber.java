package src.CodePractice;

/*
Write a method that calculates the factorial of a given number.
Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
Test Data:
Input a number: 1
Input a number: 4
Input a number: 6
Input a number: 8

Expected output:
Factorial of 1 = 1
Factorial of 4 = 24
Factorial of 6 = 720
Factorial of 8 = 40320
 */

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        int factorial = 1;
        for(int i=1; i<=number; i++){
            factorial = factorial * i;
        }
        System.out.print("Factorial of " + number + " = " + factorial);
    }
}
