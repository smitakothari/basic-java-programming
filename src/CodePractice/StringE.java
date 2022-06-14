package src.CodePractice;

/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */

import java.util.Scanner;

public class StringE {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        int count = 0;
        boolean response = false;
        for(int i=0; i< input.length(); i++){
            if(input.charAt(i) == 'e'){
                count++;
            }
        }
        if(count >=1 && count <= 3){
            response = true;
        }
        System.out.print(response);
    }
}
