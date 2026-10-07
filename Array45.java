/*Given an sorted array arr[] of integers. Sort the array into a wave-like array (In Place). In other words, arrange the elements into a sequence such that : arr[0] ≥ arr[1] ≤ arr[2] ≥ arr[3] ≤ arr[4] ≥ ... and so on. If there are multiple solutions, find the lexicographically smallest one.

Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: [2, 1, 4, 3, 5]
Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.
Input: arr[] = [2, 4, 7, 8, 9, 10]
Output: [4, 2, 8, 7, 10, 9]
Explanation: Array elements after sorting it in the waveform are 4, 2, 8, 7, 10, 9.
Input: arr[] = [1]
Output: [1] */

import java.util.Scanner;

public class Array45 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Write an element in array :: ");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if ((i % 2) == 0) {
                int t = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = t;
            }

        }
        System.out.println("Wave array :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

        cin.close();
    }

}
