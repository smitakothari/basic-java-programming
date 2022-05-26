package src.CodePractice;

/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
Test Data:
Scenario 1 - Input a string: mix snacks
Scenario 2 - Input a string: pix snacks
Scenario 3 - Input a string: piz snacks
Scenario 4 - Input a string: n
Expected output:
Scenario 1: true
Scenario 2: true
Scenario 3: false
Scenario 4 - false
 */

import java.util.Scanner;

public class mixStart {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        boolean result = false;
        String input = scanner.next();
        if(input.length() >= 3){
            result = input.substring(1,3).contains("ix");
        }
        System.out.print(result);
    }
}
