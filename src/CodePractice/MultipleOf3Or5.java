package src.CodePractice;

/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
Test Data:
Scenario 1: Input a number: 3
Scenario 2: Input a number: 10
Scenario 3: Input a number: 8
Expected Output :
Scenario 1: true
Scenario 2: true
Scenario 3: false
 */

import java.util.Scanner;

public class MultipleOf3Or5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        boolean result = false;
        if(number >= 0) {
            if (number % 3 == 0 || number % 5 == 0) {
                result = true;
            }
        }
        System.out.print(result);
    }
}
