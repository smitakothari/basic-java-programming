package src.CodePractice;

/*
You and your date are trying to get a table at a restaurant.
The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes.
The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
If either of you is very stylish, 8 or more, then the result is 2 (yes).
With the exception that if either of you has style of 2 or less, then the result is 0 (no).
Otherwise the result is 1 (maybe).

dateFashion(5, 10) → 2
dateFashion(5, 2) → 0
dateFashion(5, 5) → 1
 */

import java.util.Scanner;

public class DateFashion {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your stylishness: ");
        int you = scanner.nextInt();
        System.out.print("Enter your date's stylishness: ");
        int date = scanner.nextInt();
        if(you <= 2 || date <= 2){
            System.out.print(0);
        }
        else if(you >= 8 || date >= 8){
            System.out.print(2);
        }
        else {
            System.out.print(1);
        }
    }
}
