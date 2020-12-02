/*
Create a package called test package;
Define a class called foundation inside the test package;
Inside the class, you need to define 4 integer variables;
Var1 as private;
Var2 as default;
Var3 as protected;
Var4 as public;
Import this class and packages in another class.
Try to access all 4 variables of the foundation class and see what variables are accessible and
what are not accessible.
 */

package Topic5.Assignment1;

import Topic5.Assignment1.test.Foundation;

public class Assignment1 {
    public static void main(String[] args) {
        Foundation foundation = new Foundation();
        foundation.Var4=10;

        System.out.println(foundation.Var4);
        //Var1,2,3 not accessible as they aren't set to public.
    }
}