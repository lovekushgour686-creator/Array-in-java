import java.util.Scanner;

/*

Input
The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.

The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), where ai is the score earned by the participant who got the i-th place. 
The given sequence is non-increasing (that is, 
for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).

Output
Output the number of participants who advance to the next round.


Examples
InputCopy
8 5
10 9 8 7 7 7 5 5
OutputCopy
6



*/
public class Array37 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter size :: ");
        int n = cin.nextInt();
        System.out.print("Enter index :: ");
        int k = cin.nextInt();
        int a[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();

        }
        int c = a[k];
        for (int i = 0; i < n; i++) {
            if (a[i] >= c && a[i] != 0) {
                count++;
            }

        }
        System.out.println("Count :: " + count);
        cin.close();
    }
}
