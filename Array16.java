import java.util.Scanner;

/*Left Rotate Array by One Position
Question

Write a Java program to rotate array left by one position. */
public class Array16 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size;
        System.out.println("Write an size of array----->");
        size = cin.nextInt();

        int a[] = new int[size];
        int l[] = new int[size];
        System.out.println("Write an integer------------>");

        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();

        }

        System.out.println("left rotate-->");
        System.out.print("[");
        for (int i = 0; i < size - 1; i++) {
            if (i >= 0) {
                if (i == 0) {
                    l[size - 1] = a[i];
                }
                l[i] = a[i + 1];

            }

        }
        for (int i = 0; i < size; i++) {
            System.out.print("Index - >" + i + "--->" + l[i]);

            if (i != size - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        cin.close();

    }
}
