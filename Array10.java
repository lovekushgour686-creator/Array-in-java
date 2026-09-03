
/*Copy One Array into Another
Question

Write a Java program to copy elements from one array to another. */
import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int size;
        System.out.println("<---------Write size of an array-------->");
        size = cin.nextInt();

        int a[] = new int[size];
        int c[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();
            c[i] = a[i];
        }
        System.out.println("<--------------Display Original Array------------->");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Copy an array element--------->");
        for (int i = 0; i < size; i++) {
            System.out.println(c[i]);
        }
        cin.close();
    }
}
