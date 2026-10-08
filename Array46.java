import java.util.Scanner;

public class Array46 {
    /*
     * Given an array arr[]. Rotate the array to the left (counter-clockwise
     * direction) by d steps, where d is a positive integer. Do the mentioned change
     * in the array in place.
     * 
     * Note: Consider the array as circular.
     * 
     * Examples :
     * 
     * Input: arr[] = [1, 2, 3, 4, 5], d = 2
     * Output: [3, 4, 5, 1, 2]
     * Explanation: when rotated by 2 elements, it becomes [3, 4, 5, 1, 2].
     * Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
     * Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
     * Explanation: when rotated by 3 elements, it becomes [8, 10, 12, 14, 16, 18,
     * 20, 2, 4, 6].
     * Input: arr[] = [7, 3, 9, 1], d = 9
     * Output: [3, 9, 1, 7]
     * Explanation: when we rotate 9 times, we'll get [3, 9, 1, 7] as resultant
     * array.
     */

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];

        System.out.println("Write in array :: ");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }

        int arr2[] = new int[arr.length];

        System.out.println("Enter rotation steps :: ");
        int d = cin.nextInt();
        int k = (arr.length) - d;
        k = Math.abs(k);
        while (k > arr.length) {
            k = (k - arr.length);
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                arr2[arr.length - 1 - i] = arr[i];

            } else if (i >= k && i <= arr.length - 1) {
                arr2[i - k] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i]);
        }

        cin.close();

    }
}