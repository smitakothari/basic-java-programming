package src.CodePractice;

/*
There is a single operator in Java, capable of providing the remainder of a division operation.
Two numbers are passed as parameters.
The first parameter divided by the second parameter will have a remainder, possibly zero. Return that value.

remainder(1, 3) ➞ 1
remainder(3, 4) ➞ 3
remainder(-9, 45) ➞ -9
remainder(5, 5) ➞ 0
 */

import java.util.Scanner;

public class RemainderOfNumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        int remainder = firstNumber % secondNumber;
        System.out.print(remainder);
    }
}
