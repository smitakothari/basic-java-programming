package src.CodePractice;

/*
Write a function that converts hours into seconds.
howManySeconds(2) ➞ 7200
howManySeconds(10) ➞ 36000
howManySeconds(24) ➞ 86400
 */

import java.util.Scanner;

public class HoursToSeconds {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int hours = scanner.nextInt();
        int result = hours * 60 * 60;
        System.out.print(result);
    }
}
