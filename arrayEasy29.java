
/*Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores). */

import java.util.ArrayList;
import java.util.Scanner;

public class arrayEasy29 {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        System.out.println("Write element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                List.add(arr[i]);

            } else {
                count++;
            }
        }
        System.out.println("Remove Duplicates from Sorted Array----------------->");
        List.add(arr[arr.length - 1]);

        System.out.println("K - > " + List.size());
        System.out.print("[");
        for (int i = 0; i < List.size() + count; i++) {
            if (i < List.size()) {
                System.out.print(List.get(i));
            } else {
                System.out.print("_");
            }

            if (i != (List.size() + count)-1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
       

        cin.close();

    }
}
