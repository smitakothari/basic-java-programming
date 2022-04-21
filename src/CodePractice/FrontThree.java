package src.CodePractice;

/*
Given a string, we'll say that the front is the first 3 chars of the string.
If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
Test Data:
Scenario 1 - Input a string: Java
Scenario 2 - Input a string: Chocolate
Scenario 3 - Input a string: abc
Scenario 4 - Input a string: aa
Expected output:
Scenario 1: JavJavJav
Scenario 2: ChoChoCho
Scenario 3: abcabcabc
Scenario 4 - aaaaaa
 */

import java.util.Scanner;

public class FrontThree {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = scanner.next();
        if(input.length() < 3){
            System.out.print(input + input + input);
        }
        else {
           String firstThree = input.substring(0,3);
           System.out.print(firstThree + firstThree + firstThree);
        }
    }
}
