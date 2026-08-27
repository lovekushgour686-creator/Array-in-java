/*Find Sum of Array Elements
Question

Write a Java program to find the sum of all elements in an array. */

import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int size;
        System.out.print("Write size of an array --->");
        size = cin.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a[i];
        }
        System.out.println("Sum of array ---> " + sum);
        cin.close();
    }
}
