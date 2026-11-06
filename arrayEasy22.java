/*You are given an array arr[] consisting of positive integers. Return the maximum of all adjacent pairs in the array.

Examples:

Input: arr[] = [1, 2, 2, 3, 4, 5]
Output: [2, 2, 3, 4, 5]
Explanation: Maximum of arr[0] and arr[1] is 2, that of arr[1] and arr[2] is 2, ... and so on.
Input: arr[] = [5, 5]
Output: [5]
Explanation: We only have two elements so max of 5 and 5 is 5 only. */

import java.util.ArrayList;
import java.util.Scanner;

public class arrayEasy22 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter size of array ::");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Write an element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        System.out.println("Return Max Of all Adjacent :: ");
        for (int i = 0; i < arr.length - 1; i++) {
            int max = Math.max(arr[i], arr[i + 1]);
            list.add(max);
        }
        System.out.println(list);
        cin.close();
    }
}
