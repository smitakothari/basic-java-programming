package src.CodePractice;

/*
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string,
e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
 */

import java.util.Scanner;

public class MakeOutWord {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter out string: ");
        String outString = scanner.next();
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println(outString.substring(0,2) + word + outString.substring(2,4));
    }
}
