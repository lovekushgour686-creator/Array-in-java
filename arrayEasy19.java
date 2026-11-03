/*Given an array arr1. The contents of arr are copied into another array arr2 and numbers are shuffled.
 Also, one element is removed from arr2. The task is to find the missing element.

Examples:
Input: arr1[] = [4, 8, 1, 3, 7] and arr2[] = [7, 4, 3, 1]
Output: 8
Explanation: 8 is the only element missing from arr2.
Input: arr1[] = [12, 10, 15, 23, 11, 30] and arr2[] = [15, 12, 23, 11, 30]
Output: 10
Explanation: 10 is the only element missing from arr2. */

import java.util.Scanner;

public class arrayEasy19 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr1[] = new int[size];
        System.out.println("Write element in array first :: ");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = cin.nextInt();
        }
        System.out.println("Enter size of array :: ");
        int size1 = cin.nextInt();
        int arr2[] = new int[size1];
        System.out.println("Write element in array Second :: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = cin.nextInt();
        }
        int re = 0;
        System.out.println("Find missing element -------------> ");
        for (int i = 0; i < size1; i++) {
            boolean r = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    r = true;
                }
            }
            if (!r) {
                re = arr1[i];
            }

        }
        System.out.println("Missing number :: " + re);
        cin.close();

    }
}
