/*
Write a Java Program which will print the current time on the console every 2 seconds.
After doing this activity for 20 seconds the program quits.
 */

package Topic4.Assignment2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
        }
    }
}
