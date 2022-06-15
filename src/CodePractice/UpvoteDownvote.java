package src.CodePractice;

/*
Given an object containing counts of both upvotes and downvotes, return what vote count should be displayed.
This is calculated by subtracting the number of downvotes from upvotes.

getVoteCount({ upvotes: 13, downvotes: 0 }) ➞ 13
getVoteCount({ upvotes: 2, downvotes: 33 }) ➞ -31
getVoteCount({ upvotes: 132, downvotes: 132 }) ➞ 0
 */

import java.util.Scanner;

public class UpvoteDownvote {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter upvote count: ");
        int upvote = scanner.nextInt();
        System.out.print("Enter downvote count: ");
        int downvote = scanner.nextInt();
        int voteCount = upvote - downvote;
        System.out.print(voteCount);
    }
}
