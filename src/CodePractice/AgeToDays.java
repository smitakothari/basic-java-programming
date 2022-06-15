package src.CodePractice;

/*
Create a function that takes the age in years and returns the age in days.
calcAge(65) ➞ 23725
calcAge(0) ➞ 0
calcAge(20) ➞ 7300
 */

import java.util.Scanner;

public class AgeToDays {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        int days = age * 365;
        System.out.print(days);
    }
}
