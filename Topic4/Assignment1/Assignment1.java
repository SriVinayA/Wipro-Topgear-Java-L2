/*
Write a Java Program, where one thread prints a number ( Generate a random number
using Math.random) and another thread prints the factorial of that given number. Both
the outputs should alternate each other.
Eg: Number : 2
Factorial of 2 : 2
Number : 5
Factorial of 5 : 120
The program can quit after executing 5 times.
 */

package Topic4.Assignment1;

public class Assignment1 {
    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
//        Thread t2 = new Thread(r);
        t.start();
//        t2.start();
    }
}

class Runnable1 implements Runnable {
    public void run() {
        for (int n = 1; n < 6; n++) {
            int random = (int) (Math.random() * 10);
            System.out.println("Number : " + random);
            int fac = 1;
            if (random == 0) {
                System.out.println("Factorial  of " + random + " : 1");
            } else {
                for (int i = 1; i <= random; i++)
                    fac = fac * i;
                System.out.println("Factorial  of " + random + " : " + fac);
            }
            System.out.println();
        }
    }
}
