package src.CodePractice;
/*
Write a function that takes an integer minutes and converts it to seconds.
convert(5) ➞ 300
convert(3) ➞ 180
convert(2) ➞ 120
 */

import java.util.Scanner;

public class MinutesToSecond {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int minutes = scanner.nextInt();
        int result = minutes * 60 ;
        System.out.print(result);
    }
}
