package src.CodePractice;

/*
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

Test Data:
Scenario 1 - Input a string: kitten
Scenario 2 - Input a string: Ha
Scenario 3 - Input a string: abc
Expected output:
Scenario 1: kikittenki
Scenario 2: HaHaHa
Scenario 3: ababcab
 */

import java.util.Scanner;

public class Front22 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = scanner.next();
        String sub = null;
        if(input.length() >= 0 && input.length() < 2){
            sub = input.substring(0);
        }
        else{
            sub = input.substring(0, 2);
        }
        System.out.print(sub + input + sub);
    }
}
