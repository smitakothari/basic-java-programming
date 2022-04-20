package src.CodePractice;

/*
Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
Test Data:
Input n: 15
Input n: 10
Input n: 110
Expected output:
60
33
2843
 */

import java.util.Scanner;

public class SumOfMultiples {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%3 == 0 || i%5 ==0){
                sum = sum + i;
            }
        }
        System.out.print(sum);
    }
}
