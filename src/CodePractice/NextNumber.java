package src.CodePractice;

/*
Create a function that takes a number as an argument, increments the number by +1 and returns the result.
addition(0) ➞ 1
addition(9) ➞ 10
addition(-3) ➞ -2
 */

import java.util.Scanner;

public class NextNumber {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print(number + 1 );
    }
}
