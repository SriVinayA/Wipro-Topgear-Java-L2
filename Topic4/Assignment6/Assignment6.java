/*
Develop a java class that has finalize method which displays “Finalize method called”. Create
another class which creates objects of the previous class and it uses the same object reference for
creating these objects. For example, if A1 is the class name, then the objects are created as
below :
A1 a = new A1();
a = new A1();
a = new A1();
When the statement Runtime.getRuntime().gc() is invoked, how many times the finalize method
is called
 */

package Topic4.Assignment6;

public class Assignment6 {
    public static void main(String[] args) {
        A1 a = new A1();
        a = new A1();
        a = new A1();

        Runtime.getRuntime().gc();
    }
}

class A1 {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}
