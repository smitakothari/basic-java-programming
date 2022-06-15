package src.CodePractice;

/*
Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
NOTE: (side1 + side2) - 1 = maximum range of third edge.
nextEdge(8, 10) ➞ 17
nextEdge(5, 7) ➞ 11
nextEdge(9, 2) ➞ 10
 */

import java.util.Scanner;

public class TriangleMaximumEdge {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side1 of triangle: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter side2 of triangle: ");
        int side2 = scanner.nextInt();
        int edge = (side1 + side2) - 1;
        System.out.print(edge);
    }
}
