
/*Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

Note: A subarray is a contiguous part of any given array. */
import java.util.Scanner;

public class Array26 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter size :: ");
        int n = cin.nextInt();
        int arr[] = new int[n];
        System.out.println("Write :::::-> ");
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        System.out.print("Enter K :: ");
        int k = cin.nextInt();
        int s = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            s = s + arr[i];
            max = s;
        }

        for (int i = k; i < n; i++) {

            s += arr[i] - arr[i - k];
            max = Math.max(s, max);

        }
        System.out.println(max);
        cin.close();

    }
}
