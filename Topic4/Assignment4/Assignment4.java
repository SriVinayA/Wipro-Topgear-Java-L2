/*
Write a program creates a HashMap to store name and phone number (Telephone book). When
name is give, we can get back the corresponding phone number.
 */

package Topic4.Assignment4;

import java.util.HashMap;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        HashMap<String, String> TelephoneBook = new HashMap<>();

        TelephoneBook.put("VINAY", "8143143151");
        TelephoneBook.put("VARUN", "9492232211");
        TelephoneBook.put("RAM", "8546792546");
        TelephoneBook.put("RIA", "9876425647");
        TelephoneBook.put("LUCKY", "9134674563");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.next().toUpperCase();

        if (TelephoneBook.containsKey(name)) {
            System.out.println(name + "\'s number = " + TelephoneBook.get(name));
        }
    }
}