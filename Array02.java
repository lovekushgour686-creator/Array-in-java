/*Take an array of names as input from the user and print them on the screen.
 */
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int size;
        System.out.println("Write an array size ---->");
        size = cin.nextInt();
        System.out.println("Write in String arr[]--->");
        String[] arr = new String[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.next();
        }
        System.out.println("Display all name------->");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        cin.close();
    }
}
