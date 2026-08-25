/*Find the maximum & minimum number in an array of integers.  */

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int size;
        System.out.println("Write an array size ---------->");
        size = cin.nextInt();

        int a[] = new int[size];
        System.out.println("Write integer in array----------->");
        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();
        }

        
        System.out.println("Find maximum number----->");
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < size; i++) {
            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Maximum :: " + max);
        System.out.println("Minimum :: " + min);
        cin.close();

    }
}
