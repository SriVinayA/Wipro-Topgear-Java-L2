package Topic1;//  Write a program to find greatest number in an array

import java.util.Arrays;

public class Assignment6 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 3, 2 };
        System.out.println("Largest: " + getLargest(arr, arr.length));
    }

    public static int getLargest(int[] arr, int len) {
        Arrays.sort(arr);
        return arr[len - 1];
    }
}