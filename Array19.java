/*Check Array is Sorted or Not
Question

Write a Java program to check array is sorted. */

import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Write size of array => ");
        int size = cin.nextInt();
        if (size == 0 || size < 0) {
            System.out.println("States :: Not Stored");
        }
        int a[] = new int[size];
        System.out.println("========================");

        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();
        }
        if (size > 0)
            System.out.println("States :: Stored");
        cin.close();
    }
}
