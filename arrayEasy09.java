import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayEasy09 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        System.out.println("Enter arr1 size :: ");
        int s1 = cin.nextInt();
        System.out.println("Write element in array :: ");
        int arr1[] = new int[s1];

        for (int i = 0; i < s1; i++) {
            arr1[i] = cin.nextInt();
        }

        System.out.println("Enter arr2 size :: ");
        int s2 = cin.nextInt();
        System.out.println("Write element in array :: ");
        int arr2[] = new int[s2];

        for (int i = 0; i < s2; i++) {
            arr2[i] = cin.nextInt();
        }

        int mrg[] = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length + arr2.length; i++) {
            if (i < arr1.length) {
                mrg[i] = arr1[i];
            } else {
                if (i >= arr1.length - 1)
                    mrg[i] = arr2[i - arr1.length];
                else {
                    mrg[i] = arr2[arr1.length - i];

                }
            }
        }
        System.out.println("write --- >");
        Arrays.sort(mrg);
        for (int i = 0; i < mrg.length - 1; i++) {
            if (mrg[i] != mrg[i + 1]) {
                List.add(mrg[i]);
            }
        }
        List.add(mrg[mrg.length - 1]);
        System.out.println(List);
        cin.close();
    }

}
