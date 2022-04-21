package src.CodePractice;

/*
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt".
The original string will be length 1 or more.
Test Data:
Scenario 1 - Input a string: cat
Scenario 2 - Input a string: Hello
Scenario 3 - Input a string: a
Expected output:
Scenario 1: tcatt
Scenario 2: oHelloo
Scenario 3: aaa
 */

import java.util.Scanner;

public class BackAround {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = scanner.next();
        int length = input.length();
        if(length < 1){
            System.out.print("Input is too small");
        }
        else {
            char lastChar = input.charAt(length -1);
            System.out.print(lastChar + input + lastChar);
        }
    }
}
