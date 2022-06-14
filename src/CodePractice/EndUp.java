package src.CodePractice;

/*
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there.
Note that str.toUpperCase() returns the uppercase version of a string.

endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 */

import java.util.Scanner;

public class EndUp {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        String result;
        int length = input.length();
        if(length <= 3){
            result = input.toUpperCase();
        } else{
            result = input.substring(0, length - 3) + input.substring(length - 3).toUpperCase();
        }
        System.out.print(result);
    }
}
