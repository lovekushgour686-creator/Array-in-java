
/*Find Pair with Given Sum
Question

Write a Java program to find pair with given sum. */
import java.util.Scanner;

public class Array22 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Write an array size :: ");
        int size = cin.nextInt();
        int a[] = new int[size];
        boolean r = false;
        System.out.println("Target element pair ::::-->");
        int t = cin.nextInt();
        System.out.println("Enter element ------->");
        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();
        }
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] + a[j] == t) {
                    r = true;
                    System.out.print("(" + a[i] + "," + a[j] + ")");
                }
            }

        }
        System.out.print("]");

        if (!r) {
            System.out.println("\nVerification :: No pair Found*");
        } else {
            System.out.println("\nVerification :: Pair Found");
        }
        cin.close();

    }
}
