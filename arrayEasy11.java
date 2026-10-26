/*Given an array of integers arr[], the task is to find the first equilibrium point in the array.

The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists. 

Examples:

Input: arr[] = [1, 2, 0, 3]
Output: 2 
Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.
Input: arr[] = [1, 1, 1, 1]
Output: -1
Explanation: There is no equilibrium index in the array.
Input: arr[] = [-7, 1, 5, 2, -4, 3, 0]
Output: 3
Explanation: The sum of left of index 3 is -7 + 1 + 5 = -1 and sum on right of index 3 is -4 + 3 + 0 = -1. */

import java.util.Scanner;

public class arrayEasy11 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        System.out.println("Write element in array :: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int l = 0;

        int set = -1;
        for (int i = 0; i < arr.length; i++) {

            if (l != (sum - arr[i] - l)) {
                l += arr[i];

            }

            else {
                set = i;
                break;

            }
        }

        System.out.println("Equilibrium :: " + set);
        cin.close();

    }
}
