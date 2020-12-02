/*
Write a program to accept 5 integers passed as arguments while executing the class. Find the
average of these 5 nos. Use ArrayIndexOutofBounds exception to handle situation where the
user might have entered less than 5 integers.
 */

package Topic3.Assignment3;

public class Assignment3 {
    public static void main(String[] args) {
        double avg = 0;
        int[] a = new int[args.length];
        int num;
        for (int i = 0; i < args.length; i++) {
            num = Integer.parseInt(args[i]);
            a[i] = num;
            avg += num;
            System.out.println("Number =" + num);
        }

        try {
            if (a.length != 5) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                avg = avg / a.length;
                System.out.println(avg);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + ": Please pass 5 integers");
        }
    }
}
