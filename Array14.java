
/*Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist. */
import java.util.Arrays;
import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size;
        System.out.print("Write the size of array ::>");
        size = cin.nextInt();
        int[] arr = new int[size];

        System.out.println("Write  integer in array ::>");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[0];
        int maxsec = arr[0];
        boolean r = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                maxsec = max;
                max = arr[i];
                r = true;
            }
            if (arr[i] > maxsec && arr[i] != max) {
                maxsec = arr[i];
                r = true;

            }

        }
        if (r)
            System.out.println("Second Largest ---> " + maxsec);

        else
            System.out.println("Second largest element not exist :: -1");
        cin.close();
    }
}
