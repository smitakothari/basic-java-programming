package src.CodePractice;

/*
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
 */

import java.util.Scanner;

public class In3050 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        if((firstNumber >= 30 && firstNumber <= 40) && (secondNumber >= 30 && secondNumber <= 40)){
            System.out.print(true);
        }
        else if ((firstNumber >= 40 && firstNumber <= 50) && (secondNumber >= 40 && secondNumber <= 50)) {
                System.out.print(true);
            }
        else System.out.print(false);
    }
}
