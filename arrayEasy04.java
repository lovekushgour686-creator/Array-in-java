import java.util.ArrayList;
import java.util.Scanner;

/*Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3. */
public class arrayEasy04 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter size :: ");
        int size = cin.nextInt();

        int arr[] = new int[size];
        System.out.println("Write in array :: ");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
            List.add(arr[i]);
        }

        int count = 0;
        int max = 0;
        for (int n : List) {
            if (n == 1) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 0;
            }
        }
        System.out.println("Consecutive 1s :: " + count);
        cin.close();

    }
}