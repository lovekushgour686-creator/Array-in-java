/*Given two sorted arrays a[] and b[], find and return the median of the combined 
array after merging them into a single sorted array.

Examples:

Input: a[] = [3, 5, 6, 12, 15], b[] = [3, 4, 6, 10, 10, 12]
Output: 6
Explanation: The merged array is [3, 3, 4, 5, 6, 6, 10, 10, 12, 12, 15]. 
So the median of the merged array is 6.
Input: a[] = [2, 3, 5, 8], b[] = [10, 12, 14, 16, 18, 20]
Output: 11
Explanation: The merged array is [2, 3, 5, 8, 10, 12, 14, 16, 18, 20].
 So the median of the merged array is (10 + 12) / 2 = 11. */

import java.util.Arrays;
import java.util.Scanner;

public class Array39 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter First array size :: ");
        int n = cin.nextInt();
        System.out.print("Enter Second array size :: ");
        int m = cin.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        int mrg[] = new int[m + n];
        System.out.println("First ::--->");
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
            mrg[i] = a[i];
        }
        System.out.println("Second ::--->");
        for (int i = 0; i < m; i++) {
            b[i] = cin.nextInt();
            mrg[a.length + i] = b[i];
        }

        Arrays.sort(mrg);
        System.out.println("Marage array :: ");
        for (int i = 0; i < m + n; i++) {
            System.out.println(mrg[i]);
        }
        double r = 0;
        int length = mrg.length;
        if (length % 2 != 0) {
            r = mrg[length / 2];
        } else {
            r = (mrg[(length / 2) - 1] + mrg[(length / 2)]) / 2.0;

        }

        System.out.println("Median :: " + r);
        cin.close();

    }
}