/*Given an array arr[], the task is to find whether the arr is palindrome or not. 
If the arr is palindrome then return true else return false.

Note: An array is said to be palindrome if its reverse array matches the original array.


Examples:

Input: arr = [1, 2, 3, 2, 1]
Output: true
Explanation: If we reverse, we get [1, 2, 3, 2, 1] 
which is the same as before. So, the answer is true.

*/

import java.util.Scanner;

public class Array34 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter size :: ");
        int n = cin.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }
        int i = 0;
        boolean r = false;
        while (i < a.length / 2) {
            if (a[i] == a[a.length - 1 - i]) {
                r = true;
            }
            i++;

        }
        System.out.println("Checked :: Palindrom ------> ");
        if (r) {
            System.out.println(r);
        } else {
            System.out.println(r);
        }
        cin.close();
    }
}
