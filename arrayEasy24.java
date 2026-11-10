/*. Longest Increasing Subsequence
Find the length of the longest strictly increasing subsequence of an array.
Example: [10, 9, 2, 5, 3, 7, 101, 18]
Output: 4 */

import java.util.Scanner;

public class arrayEasy24 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        int store = 0;
        int find = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                find++;
            } else {
                store = Math.max(find, store);
                find = 1;
            }
        }
        System.out.println("----------> " + store);
        cin.close();

    }
}
