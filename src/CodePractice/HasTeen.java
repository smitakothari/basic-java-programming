package src.CodePractice;

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

Test Data:
scenario 1:
Input first number: 13
Input second number: 20
Input third number: 10
scenario 2:
Input first number: 20
Input second number: 19
Input third number: 10
scenario 3:
Input first number: 20
Input second number: 10
Input third number: 13
Expected output:
scenario 1: true
scenario 2: true
scenario 3: true
 */

import java.util.Scanner;

public class HasTeen {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Input third number: ");
        int thirdNumber = scanner.nextInt();
        boolean result = false;
        if((firstNumber >= 13 && firstNumber <= 19) ||
                (secondNumber >= 13 && secondNumber <= 19) ||
                (thirdNumber >=13 && thirdNumber <= 19)
        ){
            result = true;
        }
        System.out.print(result);
    }
}
