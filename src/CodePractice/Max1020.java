package src.CodePractice;

/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.


max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */

import java.util.Scanner;

public class Max1020 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        int result = 0;
        if(firstNumber >= secondNumber){
            if(firstNumber >= 10 && firstNumber <=20)
                result = firstNumber;
            else if(secondNumber >= 10 && secondNumber <= 20)
                result = secondNumber;
        } else {
            if(secondNumber >= 10 && secondNumber <= 20)
                result = secondNumber ;
            else if(firstNumber >= 10 && firstNumber <=20)
                result = firstNumber;
        }
        System.out.print(result);
    }
}
