
/*Given a binary array nums, return the maximum number of consecutive 1's in the array. */

import java.util.Scanner;

public class Array25 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter size :: ");

        int n = cin.nextInt();
        int a[] = new int[n];
        System.out.println("---------------------->");
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();

        }
        int c = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                c++;
                max = Math.max(c, max);
            } else {

                c = 0;

            }

        }

        System.out.println("---------> " + max);
        cin.close();
    }

}
