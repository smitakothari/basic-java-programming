package src.CodePractice;

/*
Given an n-sided regular polygon n, return the total sum of internal angles (in degrees).

sumOfAngles(3) ➞ 180
sumOfAngles(4) ➞ 360
sumOfAngles(6) ➞ 720

Notes
n will always be greater than 2.
The formula (n - 2) x 180 gives the sum of all the measures of the angles of an n-sided polygon.
 */

import java.util.Scanner;

public class PolygonAngles {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        if(number > 2){
            sum = (number - 2) * 180;
        }
        System.out.print(sum);
    }
}
