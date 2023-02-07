package CodePractice;

/*
You are driving a little too fast, and a police officer stops you.
Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0
 */

import java.util.Scanner;

public class CaughtSpeeding
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed: ");
        int speed = scanner.nextInt();
        System.out.print("Is it your birthday (true/false) ? ");
        boolean isBirthday = scanner.nextBoolean();
        int addToSpeed = 0;
        if (isBirthday)
        {
            addToSpeed = 5;
        }
        if (speed <= (addToSpeed + 60))
        {
            System.out.println(0);
        }
        else if (speed >= (addToSpeed + 81))
        {
            System.out.println(2);
        }
        else
        {
            System.out.println(1);
        }
    }
}
