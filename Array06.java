
/*Search an Element in Array
Question

Write a Java program to search an element in an array. */
import java.util.Scanner;

public class Array06 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size;
        System.out.print("Write size of an array ---> ");
        size = cin.nextInt();

        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();
        }

        int find;
        System.out.print("Which element you search --> ");
        find = cin.nextInt();
        String m = "Not Found";
        for (int i = 0; i < size; i++) {
            if (a[i] == find) {
                m = "Found";
            }
        }
        System.out.println("Search :: " + m);
        cin.close();

    }
}
