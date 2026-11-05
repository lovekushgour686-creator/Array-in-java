/*Given an array arr that is not completely filled and a value val, you have to insert the value at the end of the array.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], val = 90
Output: [1, 2, 3, 4, 5, 90]
Explanation: After inserting 90 at the end, we have array elements as 1 2 3 4 5 90.
Input: arr[] = [1, 2, 3], val = 50
Output: [1, 2, 3, 50]
Explanation: After inserting 50 at the end, we have array elements as 1 2 3 50. */

import java.util.Scanner;

public class arrayEasy21 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr1[] = new int[size];
        System.out.println("write an element in array :: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = cin.nextInt();
        }

        System.out.println("Enter value went to add in array :: ");
        int val = cin.nextInt();

        int arr[] = new int[arr1.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                arr[i] = arr1[i];
            } else {
                arr[i] = val;
            }
        }
        System.out.println("Array :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        cin.close();
    }
}
