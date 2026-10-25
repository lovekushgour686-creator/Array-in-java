import java.util.ArrayList;
import java.util.Scanner;

/*Given an array arr[] of n elements in the form {a1, a2, a3, ..., a(n/2), b1, b2, b3, ..., b(n/2)}, rearrange the array in place to {a1, b1, a2, b2, a3, b3, ..., a(n/2), b(n/2)} without using extra space.

Note: n is always even.

Examples:

Input: arr[] = [1, 2, 9, 15]
Output: [1, 9, 2, 15]
Explanation: Here a1 = 1, a2 = 2, b1 = 9, b2 = 15. The final array becomes a1, b1, a2, b2 = [1, 9, 2, 15].
Input: arr[] = [1, 2, 3, 4, 5, 6]
Output: [1, 4, 2, 5, 3, 6]
Explanation: Here a1 = 1, a2 = 2, a3 = 3, b1 = 4, b2 = 5, b3 = 6. The final array becomes a1, b1, a2, b2, a3, b3 = [1, 4, 2, 5, 3, 6].
 */
public class arrayEasy10 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter size :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Write element in array :: ");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
        int st = 0;
        int h = (arr.length) / 2;
        if ((arr.length & 1) != 0) {
            List.add(0);
            st = 1;
        }

        int s = 0;
        for (int i = st; i < arr.length; i++) {
            if ((i & 1) == 0) {
                List.add(arr[s]);
                s++;
            } else {
                List.add(arr[h]);
                h++;
            }

        }
        System.out.println(List);
        cin.close();
    }
}
