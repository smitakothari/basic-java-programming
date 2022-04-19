package src.CodePractice;

/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
Test Data:
How many numbers you want to enter? 5
Input first number: 10
Input second number: 20
Input third number: 30
Input fourth number: 40
Enter fifth number: 50

Expected output:
Average of 5 numbers is: 30
 */

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers you want to enter? ");
        int number = scanner.nextInt();
        int[] numbers = new int[number];
        for(int i=0; i<number; i++) {
            System.out.print("Input number: ");
            numbers[i] = scanner.nextInt();
        }
        int average, sum = 0;
        for (int j =0 ; j<number; j++) {
            sum = sum + numbers[j];
        }
        average = sum/number;
        System.out.print("Average of " + number + " numbers is: " + average);
    }
}
