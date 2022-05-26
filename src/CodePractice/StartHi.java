package src.CodePractice;

/*
Given a string, return true if the string starts with "hi" and false otherwise.

Test Data:
Scenario 1 - Input a string: hi there
Scenario 2 - Input a string: hi
Scenario 3 - Input a string: hello hi
Scenario 4 - Input a string: h
Expected output:
Scenario 1: true
Scenario 2: true
Scenario 3: false
Scenario 4 - false
 */

import java.util.Scanner;

public class StartHi {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = scanner.next();
        boolean result = false;
        if(input.length() >= 2){
            result = input.substring(0,2).contains("hi");
        }
        System.out.print(result);
    }
}
