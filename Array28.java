import java.util.Scanner;

public class Array28 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i + 1]) {
                System.out.print(a[i]);
            }

        }
        cin.close();
    }
}
