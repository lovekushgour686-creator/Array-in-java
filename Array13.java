import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size;
        System.out.print("Write the size of array ->");
        size = cin.nextInt();
        int[] arr = new int[size];

        System.out.println("Give integer->");
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }
   
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate" + arr[i]);
                    break;
                }

            }

        }
        cin.close();
    }
}
