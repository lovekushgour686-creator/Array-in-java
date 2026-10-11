
/*Given two sorted arrays arr1[] and arr2[]. Your task is to return the intersection of both arrays.
Intersection of two arrays is said to be elements that are common in both arrays. The intersection should not count duplicate elements.
Note: If there is no intersection then return an empty array.

Examples:

Input: arr1[] = [1, 2, 3, 4], arr2[] = [2, 4, 6, 7, 8]
Output: [2, 4]
Explanation: 2 and 4 are only common elements in both the arrays.
Input: arr1[] = [1, 2, 2, 3, 4], arr2[] = [2, 2, 4, 6, 7, 8]
Output: [2, 4]
Explanation: 2 and 4 are the only common elements.
Input: arr1[] = [1, 2], arr2[] = [3, 4]
Output: []
Explanation: No common elements. */

import java.util.ArrayList;
import java.util.Scanner;

public class Array50 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter size of array1 :: ");
        int size = cin.nextInt();
        int arr1[] = new int[size];
        System.out.println("Enter size of array2 :: ");
        int size2 = cin.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Write element in arra1y :: ");
        for (int i = 0; i < size; i++) {

            arr1[i] = cin.nextInt();
        }

        System.out.println("Write element in array2 :: ");
        for (int i = 0; i < size2; i++) {

            arr2[i] = cin.nextInt();
        }
        int n = -1;
        System.out.println("----->Intersection<------");
        for (int i = 0; i < arr1.length; i++) {

            for (int c = 0; c < arr2.length; c++) {
                if (arr1[i] == arr2[c] && n != arr1[i]) {
                    List.add(arr1[i]);
                    n = arr1[i];

                }
            }
        }

        System.out.println(List);
        cin.close();

    }
}
