package src.CodePractice;

/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

Test Data:
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 */

import java.util.Scanner;

public class SleepIn {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for weekday: ");
        boolean weekday = scanner.nextBoolean();
        System.out.print("Enter value for vacation: ");
        boolean vacation = scanner.nextBoolean();
        System.out.print(sleepIn(weekday, vacation));
    }

    private static boolean sleepIn(boolean weekday, boolean vacation){
        return !weekday || vacation;
    }
}
