/* Remove duplicate ========> element
    */

import java.util.Arrays;
import java.util.Scanner;

public class Array24 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter size ------->");
        int n = cin.nextInt();
        System.out.println("Write --------->");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Remove Duplicate element ->");
        for (int i = 0; i < n - 1; i++) {

            if (a[i] == a[i + 1]) {
                continue;

            } else {
                System.out.println(a[i]);

            }
        }
        System.out.println(a[n - 1]);
        cin.close();

    }
}