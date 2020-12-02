/*
Write a program to check whether the given string is a palindrome or not.
[Hint :You have to extract each character from the beginning and end of the String and compare
it with each other. String x=”Malayalam”; char c= x.charAt(i) where i is the index]
 */

package Topic3.Assignment4;

public class Assignment4 {
    public static void main(String[] args) {
        String str = "Malayalam";
        String str1 = str.toLowerCase();
        int n = str.length();
        int j = n - 1;
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println(str + " is Not a Palindrome");
                System.exit(0);
            }
            j--;
        }
        System.out.println(str + " is a Palindrome");
    }
}