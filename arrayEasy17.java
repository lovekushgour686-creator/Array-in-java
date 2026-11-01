/*Given an unsorted array arr[ ] having both negative and positive integers. Place all negative elements at the end of the array without changing the order of positive elements and negative elements.

Note: Don't return any array, just in-place on the array.

Examples:

Input : arr[] = [1, -1, 3, 2, -7, -5, 11, 6 ]
Output : [1, 3, 2, 11, 6, -1, -7, -5]
Explanation: By doing operations we separated the integers without changing the order.
Input : arr[] = [-5, 7, -3, -4, 9, 10, -1, 11]
Output : [7, 9, 10, 11, -5, -3, -4, -1] */

import java.util.ArrayList;
import java.util.Scanner;

public class arrayEasy17 {
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

        System.out.println("All nagitive element at the end ----------> ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > -1) {
                list.add(arr[i]);

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                list.add(arr[i]);

            }
        }
        System.out.println(list);
        cin.close();

    }
}
