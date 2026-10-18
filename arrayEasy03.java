
/*Given a non-negative integer(without leading zeroes) represented as an array arr. Your task is to add 1 to the number (increment the number by 1). The digits are stored such that the most significant digit is at the starting index of the array.

Examples:

Input: arr[] = [5, 6, 7, 8]
Output: [5, 6, 7, 9]
Explanation: 5678 + 1 = 5679
Input: arr[] = [9, 9, 9]
Output: [1, 0, 0, 0]
Explanation: 999 + 1 = 1000 */
import java.util.*;

public class arrayEasy03 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter array size :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        int s = 0;

        System.out.println("Write element in array :: ");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
            s = (s * 10) + arr[i];

        }
        int r = s + 1;

        while (r > 0) {
            int rem = r % 10;
            List.add(rem);
            r /= 10;

        }
        Collections.reverse(List);
        System.out.println(List);
        cin.close();

    }
}
