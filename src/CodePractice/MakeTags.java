package src.CodePractice;

/*
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */

import java.util.Scanner;

public class MakeTags {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a tag: ");
        String tag = scanner.next();
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.print("<" + tag + ">" + word + "</" + tag + ">");
    }
}
