import java.util.Scanner;

/*. Right Rotate Array by One Position
Question

Write a Java program to rotate array right by one position. */
public class Array17 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size;
        System.out.print("Write an array size -----> ");
        size = cin.nextInt();

        int a[] = new int[size];
        int n[] = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();
        }
        System.out.println("Right Rotate array --->");

        for (int i = 0; i < a.length; i++) {
            if (i >= 0) {
                n[i] = a[size - 1];

                if (i >= 1 && i < size) {
                    n[i] = a[i - 1];
                }
            }
        }
        System.out.print("[");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
            if (i != size - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        cin.close();

    }
}
