
/*Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without using any extra space. Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.

Examples:

Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
Output: a[] = [2, 2, 3, 4], b[] = [7, 10]
Explanation: After merging the two non-decreasing arrays, we get, [2, 2, 3, 4, 7, 10] */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array36 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter size array 1 :: ");
        int n1 = cin.nextInt();
        System.out.print("Enter size array 2 :: ");
        int n2 = cin.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> List1 = new ArrayList<>();
        int a[] = new int[n1];
        int ar[] = new int[n2];
        int mrg[] = new int[n1 + n2];

        System.out.println("First array :: ");
        for (int i = 0; i < n1; i++) {
            a[i] = cin.nextInt();
            mrg[i] = a[i];
        }
        System.out.println("Second array :: ");
        for (int i = 0; i < n2; i++) {
            ar[i] = cin.nextInt();
            mrg[n1 + i] = ar[i];
        }
        Arrays.sort(mrg);
        System.out.println("Marage array :: ---> ");
        for (int i = 0; i < n2 + n1; i++) {
            System.out.println(mrg[i]);
        }
        // Return element ::
        for (int i = 0; i < n1; i++) {
            a[i] = mrg[i];
            List.add(a[i]);

        }
        for (int i = 0; i < n2; i++) {
            ar[i] = mrg[n1 + i];
            List1.add(ar[i]);

        }
        System.out.println("First Array :: " + List);
        System.out.println("Second Array :: " + List1);
        cin.close();

    }
}