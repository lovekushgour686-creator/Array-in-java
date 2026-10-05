import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*Given a sorted array arr[] with possibly some duplicates, find the first and last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.

Examples:

Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
Output: [2, 5]
Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5
Input: arr[] = [1, 3, 5, 5, 5, 5, 7, 123, 125], x = 7
Output: [6, 6]
Explanation: First and last occurrence of 7 is at index 6
Input: arr[] = [1, 2, 3], x = 4
Output: [-1, -1]
Explanation: No occurrence of 4 in the array, so, output is [-1, -1] */
public class Array44 {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Element  X :: ");
        int x = cin.nextInt();
        int l = -1;
        int f = -1;
        int c = 0;
        System.out.println("Write element in array ::  ");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();

        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {

                f = i;
                l = i;

            }

        }
        List.add(c - f);
        List.add(l);
        System.out.println(List);
        cin.close();

    }
}
