package src.CodePractice;

/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.
Test Data:
Input first number: 12
Input second number: 99

Expected Output : true
 */

import java.util.Scanner;

public class In1020 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();
        boolean result = false;
        if((firstNumber >= 10 && firstNumber <= 20) || (secondNumber >= 10 && secondNumber <= 20)){
            result = true;
        }
        System.out.print(result);
    }
}
