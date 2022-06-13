package src.CodePractice;

/*
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and
include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */

import java.util.Scanner;

public class StartOz {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String response = "";
        String input = scanner.next();
        if(input.length() == 1 && input.substring(0).contains("o")){
            System.out.print(input);
        } else if(input.length() >= 2){
            if(input.substring(0,1).contains("o")){
                response = input.substring(0,1);
            }
            if(input.substring(1,2).contains("z")){
                response = response + input.substring(1,2);
            }
            System.out.print(response);
        } else {
            System.out.print(input);
        }
    }
}
