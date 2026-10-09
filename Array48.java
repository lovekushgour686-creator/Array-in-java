import java.util.ArrayList;
import java.util.Arrays;
/*Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.

Examples:

Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: [1, 2, 3, 4, 5, 6, 7]
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
Output: [1, 2, 3, 4, 5]
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
Output: [1, 2]
Explanation: Distinct elements including both the arrays are: 1 2. */
import java.util.Scanner;

public class Array48 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter array 1 size ::");
        int size1 = cin.nextInt();
        int arr1[] = new int[size1];
        System.out.println("write in array :: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = cin.nextInt();
        }
        System.out.println("Enter array 2 size :: ");
        int size2 = cin.nextInt();
        int arr2[] = new int[size2];
        System.out.println("write in array :: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = cin.nextInt();
        }
        int arrnew[] = new int[arr1.length + arr2.length];
        System.out.println("Combines array :: ");
        for (int i = 0; i < (arr1.length + arr2.length); i++) {
            if (i < arr1.length) {
                arrnew[i] = arr1[i];
            } else {
                arrnew[i] = arr2[i - arr1.length];
            }
        }
        Arrays.sort(arrnew);
        for (int i = 0; i < arrnew.length - 1; i++) {
            if (arrnew[i] != arrnew[i + 1]) {
                List.add(arrnew[i]);
            }

        }
        List.add(arrnew[arrnew.length - 1]);
        System.out.println(List);
        cin.close();
    }

}
