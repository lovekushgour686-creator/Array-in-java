import java.util.*;

/*Given an array arr[], the goal is to compute its prefix sum array. The prefix sum array, prefixSum[],

Input: arr[] = [10, 20, 10, 5, 15]
Output: [10, 30, 40, 45, 60]
Explanation: For each index i, add all the elements from 0 to i:
prefixSum[0] = 10, 
prefixSum[1] = 10 + 20 = 30, 
prefixSum[2] = 10 + 20 + 10 = 40 and so on.
*/
public class Array32 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter size :: ");
        int size = cin.nextInt();
        int a[] = new int[size];
        System.out.print("Prefix :----------------->\n");
        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();
        }
        int sum[] = new int[size];
        sum[0] = 0;
        for (int i = 0; i < size; i++) {
            int p = 0;
            while (p <= i) {
                sum[i] += a[p];
                p++;

            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(sum[i]);
        }
        cin.close();
    }
}
