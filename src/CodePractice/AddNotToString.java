package src.CodePractice;

/*
Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
Test Data:
Scenario 1 - Input a string: candy
Scenario 2 - Input a string: x
Scenario 3 - Input a string: not bad
Expected output:
Scenario 1: not candy
Scenario 2: not x
Scenario 3: not bad
 */

import java.util.Scanner;

public class AddNotToString {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String newString = scanner.nextLine();
        if(newString.substring(0).contains("not")){
            System.out.print(newString);
        }
        else
        {
            System.out.print("not " + newString);
        }
    }
}
