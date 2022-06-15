package src.CodePractice;

/*
Create a function that takes voltage and current and returns the calculated power.
power(230, 10) ➞ 2300
power(110, 3) ➞ 330
power(480, 20) ➞ 9600
 */

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter voltage: ");
        int voltage = scanner.nextInt();
        System.out.print("Enter current: ");
        int current = scanner.nextInt();
        int power = voltage * current;
        System.out.print(power);
    }
}
