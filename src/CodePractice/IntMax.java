package src.CodePractice;

/*
Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */

import java.util.Scanner;

public class IntMax {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Input third number: ");
        int thirdNumber = scanner.nextInt();
        if(firstNumber >= secondNumber && firstNumber >= thirdNumber){
            System.out.print("The largest number is: " + firstNumber);
        }
        if(secondNumber >= firstNumber && secondNumber >= thirdNumber){
            System.out.print("The largest number is: " + secondNumber);
        }
        if(thirdNumber >= firstNumber && thirdNumber >= secondNumber){
            System.out.print("The largest number is: " + thirdNumber);
        }
    }
}
