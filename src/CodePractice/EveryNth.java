package src.CodePractice;

/*
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string.
So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
 */

import java.util.Scanner;

public class EveryNth {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        System.out.print("Position in string: ");
        int position = scanner.nextInt();
        String result = "";
        for(int i=0; i < input.length(); i= i+position){
            result = result + input.charAt(i);
        }
        System.out.print(result);
    }
}
