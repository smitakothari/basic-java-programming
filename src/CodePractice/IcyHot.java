package src.CodePractice;

/*
Given two temperatures, return true if one is less than 0 and the other is greater than 100.

Test Data:
Input first temperature: 120
Input second temperature: -1

Expected Output : true
 */

import java.util.Scanner;

public class IcyHot {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input First temperature: ");
        int temperature1 = scanner.nextInt();
        System.out.print("Input second temperature: ");
        int temperature2 = scanner.nextInt();
        boolean result = (temperature1 < 0 && temperature2 > 100) || (temperature1 > 100 && temperature2 < 0);
        System.out.print(result);
    }
}
