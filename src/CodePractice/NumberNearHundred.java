package src.CodePractice;

/*
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
Test Data:
Scenario 1 - Input a number: 93
Scenario 2 - Input a number: 90
Scenario 3 - Input a number: 89
Expected output:
Scenario 1 - true
Scenario 2 -  true
Scenario 3 - false
 */

import java.util.Scanner;

public class NumberNearHundred {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        int a = Math.abs(100- number);
        int b = Math.abs(200 - number);
        if(a <= 10 || b <= 10){
            System.out.print(true);
        }
        else {
            System.out.print(false);
        }
    }
}
