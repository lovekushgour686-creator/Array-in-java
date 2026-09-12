/*Find Common Elements Between Two Arrays
Question

Write a Java program to find common elements. */

import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Write an array(1) size ::");
        int size1 = cin.nextInt();
        int a[] = new int[size1];
        System.out.print("Write an array(2) size ::");
        int size2 = cin.nextInt();
        int a1[] = new int[size2];
        System.out.println("first array :: ");
        for (int i = 0; i < size1; i++) {
            a[i] = cin.nextInt();
        }
        System.out.println("Second array :: ");
        for (int i = 0; i < size2; i++) {
            a1[i] = cin.nextInt();
        }
        System.out.print("Common Element :: ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (a[i] == a1[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
        cin.close();

    }
}
