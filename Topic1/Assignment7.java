package Topic1;//  Write a Java program to calculate the factorial of a number without using any loop.

public class Assignment7 {
    public static void main(String[] args) {
        int fact;
        int number = 4;
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}