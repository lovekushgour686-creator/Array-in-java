/*Merge Two Arrays
Question

Write a Java program to merge two arrays.0 */

import java.util.Scanner;

public class Array11 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size;
        System.out.println("<---------Write size of an array-------->");
        size = cin.nextInt();

        int a[] = new int[size];
        int c[] = new int[size];
        int[] merge = new int[2 * size];
        System.out.println("First array-------->");
        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();

        }
        System.out.println("Second array-------->");
        for (int i = 0; i < size; i++) {

            c[i] = cin.nextInt();

        }
        System.out.println("Merge two array --------->");
        for (int i = 0; i < 2 * size; i++) {
            if (i < size) {
                merge[i] = a[i];
            }

            else {
                merge[i] = c[i - size];
            }

        }
        System.out.print("[");
        for (int i = 0; i < 2 * size; i++) {
            System.out.print(merge[i]);
            if (i != 2 * size - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        cin.close();
    }
}
