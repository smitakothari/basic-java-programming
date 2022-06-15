package src.CodePractice;

/*
Write a function that takes the base and height of a triangle and return its area.
NOTE: The area of a triangle is: (base * height) / 2
triArea(3, 2) ➞ 3
triArea(7, 4) ➞ 14
triArea(10, 10) ➞ 50
 */

import java.util.Scanner;

public class TriangleArea {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        int base = scanner.nextInt();
        System.out.print("Enter height of triangle: ");
        int height = scanner.nextInt();
        float area = (base * height) / 2;
        System.out.print(area);
    }
}
