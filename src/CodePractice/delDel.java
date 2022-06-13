package src.CodePractice;

/*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */

import java.util.Scanner;

public class delDel {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a String: ");
        String input = scanner.next();
        if(input.length() >= 4) {
            boolean isDelPresent = input.substring(1, 4).contains("del");
            if (isDelPresent) {
                input = input.substring(0, 1) + input.substring(4);
            }
        }
        System.out.print(input);
    }
}
