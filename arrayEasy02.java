import java.util.Arrays;
import java.util.Scanner;

/*Given an array arr[] of numbers from 0 to 9. Rearrange elements of the array such that after combining all the elements of the array, the number formed is maximum.

Return the resulting number in the form of a string.

Examples:

Input: arr[] = [9, 0, 1, 3, 0]
Output: 93100
Explanation: Largest is 93100 which can be formed from array digits.
Input: arr[] = [1, 2, 3]
Output: 321
Explanation: Largest is 321 which can be formed from array digits. */
public class arrayEasy02 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];

        System.out.println("Write element in array :: ");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
        Arrays.sort(arr);
        String r = "";

        for (int i = 0; i < arr.length; i++) {
            r += arr[arr.length - i - 1];

        }
        System.out.println(r);
        cin.close();
    }
}
