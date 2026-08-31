
/*Count Even and Odd Numbers
Question

Write a Java program to count even and odd elements in an array. */
import java.util.Scanner;

public class Array07 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size;
        int E = 0;
        int O = 0;

        System.out.print("Write size of an array --> ");
        size = cin.nextInt();
        int[] a = new int[size];
        System.out.println("Write an integer --------->");
        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (a[i] % 2 == 0) {
                E++;
            } else {
                O++;
            }
        }
        System.out.println("Count Even :: " + E);
        System.out.println("Count Odd :: " + O);
        cin.close();

    }
}
