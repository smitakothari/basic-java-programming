package src.CodePractice;

/*
When squirrels get together for a party, they like to have cigars.
A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
Unless it is the weekend, in which case there is no upper bound on the number of cigars.
Return true if the party with the given values is successful, or false otherwise.

cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
 */

import java.util.Scanner;

public class CigarParty {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of cigars: ");
        int cigars = scanner.nextInt();
        System.out.print("Is it weekend (true/false) ? : ");
        boolean isWeekend = scanner.nextBoolean();
        if(isWeekend && cigars >= 40){
            System.out.print(true);
        }
        else if(!isWeekend && (cigars >= 40 && cigars <=60)){
            System.out.print(true);
        }
        else {
            System.out.print(false);
        }
    }
}
