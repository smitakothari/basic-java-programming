package src.CodePractice;

/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */

import java.util.Scanner;

public class FirstHalf {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = scanner.next();
        int length = word.length();
        if(length % 2 == 0){
            System.out.print(word.substring(0, (length/2) ));
        }
        else {
            System.out.print("String length is not even");
        }
    }
}
