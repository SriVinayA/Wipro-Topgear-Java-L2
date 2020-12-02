/*
Write a Program to take care of Number Format Exception if user enters values other that integer
for calculating average marks of 2 students. The name of the students and marks in 3 subjects are
passed as arguments while executing the program.
 */

package Topic3.Assignment2;

public class Assignment2 {
    public static void main(String[] args) {
        String StudentName1 = args[0];
        result(StudentName1, Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
        String StudentName2 = args[4];
        result(StudentName2, Integer.parseInt(args[5]), Integer.parseInt(args[6]), Integer.parseInt(args[7]));
    }

    private static void result(String studentName1, int sub1, int sub2, int sub3) {
        try {
            if (sub1 < 0 || sub1 > 100)
                throw new NumberFormatException("Only Numbers Between 0 to 100 are Allowed");
            if (sub2 < 0 || sub2 > 100)
                throw new NumberFormatException("Only Numbers Between 0 to 100 are Allowed");
            if (sub3 < 0 || sub3 > 100)
                throw new NumberFormatException("Only Numbers Between 0 to 100 are Allowed");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println("Name: " + studentName1);
        System.out.println("Marks of subject 1: " + sub1);
        System.out.println("Marks of subject 2: " + sub2);
        System.out.println("Marks of subject 3: " + sub3);
        System.out.println("Average marks = " + (sub1 + sub2 + sub3) / 3);
    }
}

class NumberFormatException extends Exception {
    public NumberFormatException(String number) {
        super(number);
    }
}