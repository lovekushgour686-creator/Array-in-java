import java.util.Arrays;
import java.util.Scanner;

public class Array30 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int r = -1;
        System.out.println("Enter search ::-> ");
        int k = cin.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                r = i;
                break;
            }

        }
        if (r != -1) {
            System.out.println("Index--> " + r);
        } else {
            System.out.println("Index--> " + r);
        }
        cin.close();
    }
}
