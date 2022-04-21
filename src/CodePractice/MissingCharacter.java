package src.CodePractice;

/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
Test Data:
Scenario 1 -
Input a string: Kitten
Input a index: 1
Scenario 2 -
Input a string: Kitten
Input a index: 0
Scenario 3 -
Input a string: Kitten
Input a index: 4
Expected output:
Scenario 1: ktten
Scenario 2: itten
Scenario 3: kittn
 */

import java.util.Scanner;

public class MissingCharacter {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String word = scanner.next();
        String result = "";
        System.out.print("Input a index: ");
        int index = scanner.nextInt();
        if(index >= word.length()){
            System.out.print("Index is greater than word length");
            return;
        } else{
            for(int i=0; i < word.length(); i++){
                if(i != index){
                    result = result + word.charAt(i);
                }
            }
            System.out.print(result);
        }
    }
}
