package src.CodePractice;

/*
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
Test Data:
Scenario 1-
Input a number: 19
Scenario 2-
Input a number: 10
Scenario 3-
Input a number: 21
Expected output:
Scenario 1 - 2
Scenario 2 - 11
Scenario 3 - 0
 */

import java.util.Scanner;

public class Difference21 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        int difference = 0;
        if(number <= 21){
            difference = 21 - number;
        }
        else
        {
            difference = 2 * (number - 21);
        }
        System.out.print(difference);
    }
}
