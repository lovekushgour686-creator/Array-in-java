
/*You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

Note : A subarray is a continuous part of an array.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.
Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray [-2] has the largest sum -2.
Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25. */
import java.util.Scanner;

public class Array41 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter arr size :: ");
        int size = cin.nextInt();

        int arr[] = new int[size];
        System.out.println("Write in array :: ");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();

        }
        int max = arr[0];
        int maxsum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max + arr[i]);
            maxsum = Math.max(maxsum, max);
        }
        System.out.println("Max :: " + maxsum);
        cin.close();
    }

}
