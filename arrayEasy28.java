import java.util.Scanner;

/*You are given a 0-indexed integer array nums of size n.

Define two arrays leftSum and rightSum where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.

 

Example 1:

Input: nums = [10,4,8,3]
Output: [15,1,11,22] */
public class arrayEasy28 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Write Element ::-------> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }

        int l[] = new int[arr.length];
        int r[] = new int[arr.length];
        int L = 0;
        int S = 0;
        for (int i = 0; i < arr.length; i++) {
            l[i] = L;
            r[arr.length - 1 - i] = S;
            if (i != 0) {
                L += arr[i - 1];
                l[i] = L;
                S = S + arr[arr.length - i];
                r[arr.length - 1 - i] = S;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (l[i] >= r[i]) {
                arr[i] = l[i] - r[i];
            } else {
                arr[i] = r[i] - l[i];
            }
        }

        System.out.println("Left and Right Sum Differences ::-----------> ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        cin.close();
    }
}
