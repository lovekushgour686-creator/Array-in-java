import java.util.Scanner;

public class arrayEasy08 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        System.out.println("Write element in array :: ");
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
        for (int r = 0; r <= arr.length - 1; r++) {
            for (int c = r; c <= arr.length - 1; c++) {
                System.out.print("{");
                for (int p = r; p <= c; p++) {
                    System.out.print(arr[p] + " ");
                }
                System.out.print("}");
                System.out.println();
            }
            System.out.println();
        }
        cin.close();
    }
}
