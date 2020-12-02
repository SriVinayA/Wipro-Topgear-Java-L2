/*
Write a program to store a group of employee names into a HashSet, retrieve the elements one by
one using an Iterator.
 */

package Topic4.Assignment5;

import java.util.HashSet;

public class Assignment5 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Ram");
        set.add("Ria");
        set.add("Vinay");
        set.add("Varun");

        for (String s : set)
            System.out.println(s);
    }
}
