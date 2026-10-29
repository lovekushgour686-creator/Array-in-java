/*Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.
Input: arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted. */

import java.util.Scanner;

public class arrayEasy14 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Write element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        System.out.println("check whether the array Sort or not ||----------> ");
        boolean check = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Result :: " + check);
        } else {
            System.out.println("Result :: " + check);

        }
        cin.close();
    }
}
