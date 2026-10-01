import java.util.Scanner;

public class Array40 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size :: ");
        int size = cin.nextInt();

        int a[] = new int[size];
        System.out.println("Array ::---> ");
        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();
        }

        int L = a[0];
        int R = a[a.length - 1];
        int sum = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (L >= a[i]) {
                sum += (L - a[i]);
            }
            // Max---------------------------------R>
            else {
                L = R;
            }

        }
        System.out.println("--->" + sum);
        cin.close();
    }
}
/*
 * Input: arr[] = [2, 1, 5, 3, 1, 0, 4]
 * Output: 9
 * Explanation: Total water trapped = 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units.
 * 
 * Input: arr[] = [2, 1, 5, 3, 1, 0, 4]
 * Output: 9
 * Explanation: Total water trapped = 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units.
 */