/*Given an integer array arr[] and an integer k, reverse every consecutive group of k elements. If fewer than k elements remain at the end, reverse all of them.

Examples:

Input: arr[] = [1, 2, 3, 4, 5], k = 3
Output: [3, 2, 1, 5, 4]
Explanation: First group consists of elements 1, 2, 3. Second group consists of 4, 5.
Input: arr[] = [5, 6, 8, 9], k = 5
Output: [9, 8, 6, 5]
Explnation: Since k is greater than the number of remaining elements, the entire array is reversed. */

import java.util.ArrayList;
import java.util.Scanner;

public class arrayEasy18 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Write element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        System.out.println("Enter k-th :: ");
        int k = cin.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (i <= (arr.length - k)) {
                list.add(arr[arr.length - k - i]);
            } else if (i > (arr.length - k)) {
                list.add(arr[arr.length - (i - (arr.length - k))]);
            }
        }
        System.out.println(list);
        cin.close();
    }
}
