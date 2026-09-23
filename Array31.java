import java.util.ArrayList;
import java.util.Scanner;

public class Array31 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter size :: ");
        int s = cin.nextInt();
        int a[] = new int[s];
        System.out.println("Write :: -->");
        for (int i = 0; i < s; i++) {
            a[i] = cin.nextInt();
        }
        System.out.print("Enter target :: -> ");
        int target = cin.nextInt();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    List.add(i);
                    List.add(j);
                    break;
                }
            }
        }
        System.out.println(List);
        cin.close();

    }
}
