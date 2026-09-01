/*Sort Array in Ascending Order
Question

Write a Java program to sort an array in ascending order. */

import java.util.Arrays;
import java.util.Scanner;

public class Array08 {
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
        Arrays.sort(a);
        System.out.println("Sort an array ------> \n");
        for (int i = 0; i < size; i++) {

            System.out.println(a[i]);
        }

        cin.close();

    }
}
