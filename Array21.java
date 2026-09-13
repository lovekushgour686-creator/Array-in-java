
/*Reverse Array Without Extra Array
Question

Write a Java program to reverse array without using another array. */
import java.util.Scanner;

public class Array21 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Write an array size :: ");
        int size = cin.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = cin.nextInt();
        }
        int temp = 0;
        int b = size - 1;
        int i = 0;
        while (i < b) {
            temp = a[i];
            a[i] = a[b];
            a[b] = temp;

            i++;
            b--;
        }

        System.out.println("Display reverse element :: - - >");
        for (i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
        cin.close();

    }
}
