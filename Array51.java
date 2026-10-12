import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
public class Array51 {
    public static void main(String[] args) {
        // optimized form ;
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

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int indfirst = 0;
        int indsecond = 0;

        while (indfirst < arr1.length && indsecond < arr2.length) {
            if (arr1[indfirst] < arr2[indsecond]) {
                indfirst++;
            } else if (arr1[indfirst] > arr2[indsecond]) {
                indsecond++;
            } else {
                if (List.size() == 0 || List.get(List.size() - 1) != arr1[indfirst]) {
                    List.add(arr1[indfirst]);
                }
                indfirst++;
                indsecond++;

            }
        }

        System.out.println(List);
        cin.close();
    }
}
