package src.CodePractice;

/*
The squirrels in Palo Alto spend most of the day playing.
In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90.
Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.

squirrelPlay(70, false) → true
squirrelPlay(95, false) → false
squirrelPlay(95, true) → true
 */

import java.util.Scanner;

public class SquirrelPlay {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        int temp = scanner.nextInt();
        System.out.print("Is summer (true/false) ? : ");
        boolean isSummer = scanner.nextBoolean();
        if(!isSummer && (temp >= 60 && temp <= 90)){
            System.out.print(true);
        }
        else if(isSummer && (temp >= 60 && temp <= 100)){
            System.out.print(true);
        }
        else {
            System.out.print(false);
        }
    }
}
