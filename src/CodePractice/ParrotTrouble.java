package src.CodePractice;

/*
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
Test Data:
Scenario 1:
Is parrot talking: true
value for hour: 6
Scenario 2:
Is parrot talking: true
value for hour: 7
Scenario 3:
Is parrot talking: false
value for hour: 6
Expected output:
Scenario 1:
Is trouble: true
Scenario 2:
Is trouble: false
Scenario 3:
Is trouble: false
 */

import java.util.Scanner;

public class ParrotTrouble {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is parrot talking: ");
        boolean isTalking = scanner.nextBoolean();
        System.out.print("Value for hour: ");
        int hour = scanner.nextInt();
        boolean isTrouble = false;
        if(isTalking && (hour < 7 || hour > 20)){
            isTrouble = true;
        }
        System.out.print("Is trouble: " + isTrouble);
    }
}
