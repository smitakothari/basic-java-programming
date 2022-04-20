package src.CodePractice;

/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

Test Data:
Input aSmile: true
Input bSmile: true

Input aSmile: false
Input bSmile: false

Input aSmile: true
Input bSmile: false

Expected output:
In trouble: true
In trouble: true
In trouble: false

 */

import java.util.Scanner;

public class MonkeyTrouble {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input aSmile: ");
        boolean aSmile = scanner.nextBoolean();
        System.out.print("Input bSmile: ");
        boolean bSmile = scanner.nextBoolean();
        boolean inTrouble = false;
        if(aSmile && bSmile){
            inTrouble = true;
        }
        else if(!aSmile && !bSmile){
            inTrouble = true;
        }
        System.out.print("In trouble: " + inTrouble);
    }
}
