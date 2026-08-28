
/*Reverse an Array
Question

Write a Java program to reverse the elements of an array. */
import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size;
        System.out.print("Write size of an array -> ");
        size = cin.nextInt();
        int a[] = new int[size];
        int r[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();

        }
        System.out.println("Reversean array element ----> ");
        for (int i = size - 1, j = 0; i >= 0 || j < size; j++, i--) {
            r[j] = a[i];
            System.out.println("Index -> " + j + " Value-> " + r[j]);
        }

        cin.close();
    }

}
