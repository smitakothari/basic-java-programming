package src.CodePractice;

/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class RectangleAreaPerimeter {
   public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Width: ");
       float width = scanner.nextFloat();
       System.out.print("Height: ");
       float height = scanner.nextFloat();
       System.out.println("Area is " + width + " * " + height + " = " + width*height);
       System.out.print("Perimeter is 2 * " + width + " + " + height + " = " + (2 * (width + height)));
   }
}
