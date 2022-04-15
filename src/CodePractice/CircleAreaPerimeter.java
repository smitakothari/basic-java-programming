package src.CodePractice;

/*
Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5

Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586

 */

import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
