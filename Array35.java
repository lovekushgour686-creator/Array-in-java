import java.util.Scanner;

public class Array35 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter size :: ");
        int n = cin.nextInt();
        int a[] = new int[n];
        int fs = 0;
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
            fs = (fs * 10) + a[i];
        }
        System.out.println(fs);
        int rs = 0;
        for (int i = 0; i < n; i++) {
            rs = (rs * 10) + a[a.length - 1 - i];
        }
        System.out.println(rs);
        cin.close();
    }
}
