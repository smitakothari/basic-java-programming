package src.CodePractice;

/*
Write a function that returns the string "something" joined with a space " " and the given argument a.
giveMeSomething("is better than nothing") ➞ "something is better than nothing"
giveMeSomething("Bob Jane") ➞ "something Bob Jane"
giveMeSomething("something") ➞ "something something"
 */

import java.util.Scanner;

public class ReturnSomething {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String response = "Something " + input;
        System.out.print(response);
    }
}
