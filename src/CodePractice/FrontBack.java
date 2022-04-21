package src.CodePractice;

/*
Given a string, return a new string where the first and last chars have been exchanged.
Test Data:
Scenario 1 - Input a string: code
Scenario 2 - Input a string: a
Scenario 3 - Input a string: ab
Expected output:
Scenario 1: eodc
Scenario 2: a
Scenario 3: ba
 */

import java.util.Scanner;

public class FrontBack {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String input = scanner.next();
        int stringLength = input.length();
        if(stringLength < 2){
            System.out.print(input);
        } else if(stringLength == 2){
            String result = input.charAt(stringLength-1) + "" + input.charAt(0);
            System.out.print(result);
        } else{
            System.out.print(input.charAt(stringLength-1) + input.substring(1, stringLength-1) + input.charAt(0));
        }
    }
}
