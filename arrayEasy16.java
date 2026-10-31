import java.util.ArrayList;
import java.util.Scanner;

/*You are given an array arr[] of integers and an integer k. 
Your task is to rotate the array k times in the clockwise direction.
In a single clockwise rotation, the last element of the array moves to the front, and all
 other elements shift one position to the right.

Examples:

Input: arr[] = [1, 2, 3, 4, 5, 6], k = 2
Output: [5, 6, 1, 2, 3, 4]
Explanation: Rotating the array 2 times in clockwise gives the array [5, 6, 1, 2, 3, 4].
Input: arr[] = [1, 2, 3, 4, 5], k = 4
Output: [2, 3, 4, 5, 1]
Explanation: Rotating the array [1, 2, 3, 4, 5] four times clockwise gives the array [2, 3, 4, 5, 1]. */
public class arrayEasy16 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Write element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        System.out.println("Enter kth :: ");
        int k = cin.nextInt();
        int R = k % (arr.length);
        System.out.println("Rotate array in clockwise ::------> ");
        for (int i = (arr.length - R); i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < (arr.length - R); i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
        cin.close();

    }
}
