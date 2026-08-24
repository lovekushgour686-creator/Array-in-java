import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size;
        System.out.print("Write the size of array ->");
        size = cin.nextInt();
        int[] arr = new int[size];
        int find;
        System.out.println("Give integer->");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }

        System.out.println("Size (By using arr.length)--->" + arr.length);

        System.out.println("Enter which value you find it -------->");
        find = cin.nextInt();
        for (int i = 0; i < size; i++) {

            if (arr[i] == find) // Linear search method .
            {
                System.out.println("--> Found at " + i + " Index");
                break;
            }

        }
        cin.close();
    }
}