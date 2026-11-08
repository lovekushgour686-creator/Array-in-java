/*Given an integer array arr[] and an integer k, find and return the kth smallest element in the given array.

Examples :

Input: arr[] = [10, 5, 4, 3, 48, 6, 2, 33, 53, 10], k = 4
Output: 5
Explanation: 4th smallest element in the given array is 5.
Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
Output: 7
Explanation: 3rd smallest element in the given array is 7. */

import java.util.ArrayList
import java.util.Arrays;
import java.util.Scanner;

public class arrayEasy25 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Write element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }

        Arrays.sort(arr);

        ArrayList<Integer> List = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                List.add(arr[i]);
            }
        }
        System.out.println("Kth smallest element in array :: ----------------->>>");
        int k = cin.nextInt();
        List.add(arr[arr.length - 1]);
        System.out.println("Smallest element in array :: " + List.get(k - 1));

        cin.close();
    }
}
