
import java.util.ArrayList;

import java.util.Scanner;

/*Given an array arr containing non-negative integers. Count and return an array res where res[i] denotes the number of smaller elements on right side of arr[i].

Examples:

Input: arr[] = [12, 1, 2, 3, 0, 11, 4]
Output: [6, 1, 1, 1, 0, 1, 0]
Explanation: There are 6 smaller elements right after 12. There is 1 smaller element right after 1. And so on.
Input: arr[] = [1, 2, 3, 4, 5]
Output: [0, 0, 0, 0, 0]
Explanation: There are 0 smaller elements right after 1. There are 0 smaller elements right after 2. And so on. */
public class Array49 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter array size  :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        int list[] = new int[size];
        System.out.println("Write element in array :: ");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }

        for (int l = 0; l < arr.length; l++) {
            int count = 0;

            for (int r = l + 1; r < arr.length; r++) {
                if (arr[l] > arr[r]) {
                    count++;
                }

            }

            list[l] = count;

        }

        for (int i = 0; i < list.length; i++) {
            List.add(list[i]);
        }
        System.out.println(List);
        cin.close();
    }
}
