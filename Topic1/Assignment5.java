package Topic1;/*
Write a program that will accept a 4 digit number(assume that the user enters only 4 digit nos.)
and print the sum of all the 4 digits. For ex : If the number passed is 3629, the program should
print “The sum of all the digits entered is 20”
*/

public class Assignment5 {
    public static void main(String[] args) {
        int n = 3629;
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        System.out.println(sum);
    }
}
