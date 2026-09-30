
/*Given two sorted arrays a[] and b[] and an element k, 
the task is to find the element that would be at the kth position of the combined sorted array.

Examples :

Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
Output: 6
Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. 
The 5th element of this array is 6. */

import java.util.Arrays;
import java.util.Scanner;

public class Array38 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter First Array Size :: ");
        int n = cin.nextInt();
        System.out.print("Enter Second Array Size :: ");
        int m = cin.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        int mrg[] = new int[n + m];

        System.out.println("First array :: ");
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
            mrg[i] = a[i];

        }
        System.out.println("Second array :: ");
        for (int i = 0; i < m; i++) {
            b[i] = cin.nextInt();
            mrg[a.length + i] = b[i];
        }
        Arrays.sort(mrg);

        System.out.print("Enter kth position :: ");
        int k = cin.nextInt();
        System.out.println(mrg[k - 1]);
        cin.close();

    }
}
