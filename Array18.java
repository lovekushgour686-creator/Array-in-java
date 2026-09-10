/*Find Missing Number
Question

Write a Java program to find missing number from 1 to n. */

import java.util.Arrays;
import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Write an array size-->");
        int size = cin.nextInt();
        System.out.println("---------------->");
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();
        }
        Arrays.sort(a);
        int max = a[0];

        for (int i = 0; i < size; i++) {

            if (a[i] > max) {
                max = a[i];
            }
        }

        int method = (max * (max + 1)) / 2;
        int sum = 0;

        for (int i = 0; i < size; i++) {

            sum += a[i];

        }

        System.out.println("Missin num --> " + (method - sum));
        cin.close();
    }
}
