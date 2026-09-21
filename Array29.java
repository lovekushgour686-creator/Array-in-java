
/*


input :- [1,6,8,9,2]

input:- k=4;
[6,8,9,2,1];





*/
import java.util.Scanner;

public class Array29 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter size :: ");
        int size = cin.nextInt();
        size = Math.abs(size);
        int arr[] = new int[size];
        int a[] = new int[size];
        System.out.println("Enter :::");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
        System.out.print("Enter k ::");
        int k = cin.nextInt();
        k = Math.abs(k);
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                a[i] = arr[size - 1 - k + 1 + i];
            } else if (i > k || i == k) {
                a[i] = arr[i - (k)];
            }

        }
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
            cin.close();
        }
    }
}
