
/*Count frequency of an element  ; */
import java.util.Arrays;
import java.util.Scanner;

public class Array23 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter size ------->");
        int n = cin.nextInt();
        System.out.println("Write --------->");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }
        Arrays.sort(a);
        int f = 1;
        for (int i = 0; i < n - 1; i++) {

            if (a[i] == a[i + 1]) {
                f++;
            } else {
                System.out.println(a[i] + "--->" + f);
                f = 1;
            }
        }
        System.out.println(a[n - 1] + "--->" + f);
        cin.close();
    }
}