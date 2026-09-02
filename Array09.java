/*Sort Array in Ascending Order
Question

Write a Java program to sort an array in ascending order. */

import java.util.Scanner;

public class Array09 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size;
        System.out.print("Write size of an array --> ");
        size = cin.nextInt();
        int[] a = new int[size];
        System.out.println("Write an integer --------->");
        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();
        }

        System.out.println("Ascending order--------->");
        for (int i = 0; i < size; i++) {
            for (int check = i + 1; check < size; check++) {
                if (a[i] > a[check]) {
                    int temp = a[i];
                    a[i] = a[check];
                    a[check] = temp;
                }

            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
        cin.close();

    }
}
