/*
Write a Program to accept two Strings Wipro Bangalore as command line arguments and print
the output “Wipro Technologies Bangalore” If the command line is “ABC Mumbai”, then it
should print “ABC Technologies Mumbai” .
 */

package Topic5.Assignment2;

public class Assignment2 {
    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];

        System.out.println(a + " Technologies " + b);
    }
}
