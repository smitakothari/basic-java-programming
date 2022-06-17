package src.CodePractice;

/*
In this challenge, a farmer is asking you to tell him how many legs can be counted among all his animals. The farmer breeds three species:

chickens = 2 legs
cows = 4 legs
pigs = 4 legs
The farmer has counted his animals and he gives you a subtotal for each species.
You have to implement a function that returns the total number of legs of all the animals.
animals(2, 3, 5) ➞ 36
animals(1, 2, 3) ➞ 22
animals(5, 2, 8) ➞ 50
 */

import java.util.Scanner;

public class FarmProblem {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chickens: ");
        int chickens = scanner.nextInt();
        System.out.print("Enter number of cows: ");
        int cows = scanner.nextInt();
        System.out.print("Enter number of pigs: ");
        int pigs = scanner.nextInt();
        int legCount = (chickens * 2) + (cows * 4) + (pigs * 4);
        System.out.print(legCount);
    }
}
