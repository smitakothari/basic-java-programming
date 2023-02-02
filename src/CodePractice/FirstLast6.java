package src.CodePractice;

/*
Given an array of ints, return true if 6 appears as either the first or last element in the array.
The array will be length 1 or more.

firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
 */

import java.util.Scanner;

public class FirstLast6 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = scanner.nextInt();
        System.out.println("Enter array elements: ");
        int[] nums = new int[length];
        for(int i=0 ; i<length; i++){
            nums[i] = scanner.nextInt();
        }
        if(length == 1 && nums[0] == 6){
            System.out.print(true);
        }
        else if(length > 1 && (nums[0] == 6 || nums[length-1] == 6)){
            System.out.print(true);
        }
        else {
            System.out.print(false);
        }
    }
}
