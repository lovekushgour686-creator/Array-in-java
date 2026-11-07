/*Given an integer array arr[], check if the array contains any duplicate value.

Examples:

Input: arr = [4, 5, 6, 4]
Output: true
Explaination: 4 is the duplicate value.
Input: arr = [1, 2, 3, 4]
Output: false
Explaination: All values are distinct. */

import java.util.Scanner;

public class arrayEasy23 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];

        System.out.println("Write element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        cin.close();

        int l = arr[0];
        int r = arr[arr.length - 1];
        boolean re = false;
        while (l != r) {
            if (l < r / 2) {
                l++;
            } else {
                r--;
            }
            re = true;
        }
        if (re) {
            System.out.println(re);
        } else {
            System.out.println(re);
        }

    }
}
