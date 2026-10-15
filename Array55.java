/*Given an array arr[]. Find the majority element in the array. If no majority element exists, return -1.

Note: A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.

Examples:

Input: arr[] = [1, 1, 2, 1, 3, 5, 1]
Output: 1
Explanation: Since, 1 is present more than 7/2 times, so it is the majority element.
Input: arr[] = [7]
Output: 7
Explanation: Since, 7 is single element and present more than 1/2 times, so it is the majority element.
Input: arr[] = [2, 13]
Output: -1
Explanation: Since, no element is present more than 2/2 times, so there is no majority element. */

import java.util.ArrayList;
import java.util.Scanner;

public class Array55 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter size of array :: ");
        int size = cin.nextInt();
        int arr[] = new int[size];
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Write an element in array :: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        boolean r = true;
        System.out.println("----------------------->");
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    count++;
                }
            }
            if (count > (arr.length / 2)) {
                list.add(arr[i]);
                r = false;
                break;
            }
        }
        if (r) {
            list.add(-1);
        }
        System.out.println(list);
        cin.close();

    }
}
