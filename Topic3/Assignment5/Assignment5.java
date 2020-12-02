/*
Write a program to check the no.of occurrences of a given character within the given string
without using any loop. [Hint: String str=”How was your day today”; char c=’a’; no.of
occurrences of a is=3]
 */

package Topic3.Assignment5;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        String str = "How was your day today";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char c = scanner.next().charAt(0);

        int occ = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                occ++;
        }
        System.out.print("no. of occurrences of " + c + " is = " + occ);
    }
}
