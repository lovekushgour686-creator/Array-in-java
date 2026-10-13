/*Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
Note: You need to solve this problem without utilizing the built-in sort function.

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order. */


import java.util.Scanner;

public class Array52 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Write element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }

        System.out.println("----------------> ");
        int countzero = 0;
        int countone = 0;
        int counttwo = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countzero++;
            } else if (arr[i] == 1) {
                countone++;
            } else if (arr[i] == 2) {
                counttwo++;
            }
        }
        int i, j, z;
        for (i = 0; i < countzero; i++) {
            arr[i] = 0;
        }
        for (j = 0; j < countone; j++) {
            arr[i + j] = 1;
        }
        for (z = 0; z < counttwo; z++) {
            arr[i + j + z] = 2;
        }

        for (int c = 0; c < arr.length; c++) {
            System.out.println(arr[c]);
        }
        cin.close();
    }
}
