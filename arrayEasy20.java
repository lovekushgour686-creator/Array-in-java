/*You are given an array arr[], the task is to return a list elements of arr in alternate order (starting from index 0).

Examples:

Input: arr[] = [1, 2, 3, 4]
Output: 1 3
Explanation:
Take first element: 1
Skip second element: 2
Take third element: 3
Skip fourth element: 4
Input: arr[] = [1, 2, 3, 4, 5]
Output: 1 3 5
Explanation:
Take first element: 1
Skip second element: 2
Take third element: 3
Skip fourth element: 4
Take fifth element: 5 */

import java.util.ArrayList;
import java.util.Scanner;

public class arrayEasy20 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter swize of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("write an element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        System.out.println("Return Alternative element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            if ((i & 1) == 0) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        cin.close();
    }
}
